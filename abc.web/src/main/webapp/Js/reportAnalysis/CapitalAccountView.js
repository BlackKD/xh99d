﻿/*------------------------------------------------
* Author:Colyn-潘健  Date：2014-8-21 13:51:55
-------------------------------------------------*/
$(function () {
    MyGrid.Resize();
    MyTransferTree.Init();
});

var MyTransferTree = {
    Init: function () {

        var setting = {
            data: {
                simpleData: {
                    enable: true
                }
            },
            callback: {
                onClick: MyTransferTree.zTreeClick
            }
        };
        var nodes = [
            { id: "cust", pId: 0, name: "投资人资金对账表", href: "/reportAnalysis/investorCapitalAccountView" },
            { id: "bussi", pId: 0, name: "借款人资金对账表", href: "/reportAnalysis/guaranteeAgenciesAccountView" }];

        $.fn.zTree.init($("#MenuTree"), setting, nodes);
        MyTransferTree.zTreeClick(null, "cust", nodes[0]);
    },
    zTreeClick: function (event, treeId, treeNode) {
        $(".panel-title").attr("title", treeNode.name);
        $(".layout-panel-center .panel-title").html(treeNode.name);
        //这是去除返回的那个图标
        $(".icon-arrow_rotate_clockwise").attr("class", null);
        var url = treeNode.href;
        createFrame(".ManageTemp", url);
    }
}

var PageReturn = {

    returnUrl: function () {
        return;

    }
}