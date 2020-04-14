<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>项目归档审核</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8"/>
    <link rel="stylesheet" href="${re.contextPath}/plugin/layui/css/layui.css">
    <link rel="stylesheet" href="${re.contextPath}/plugin/lenos/main.css">
    <script type="text/javascript" src="${re.contextPath}/plugin/jquery/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="${re.contextPath}/plugin/layui/layui.all.js"
            charset="utf-8"></script>
    <script type="text/javascript" src="${re.contextPath}/plugin/tools/tool.js"></script>

</head>

<body>

<div class="x-body">
    <form class="layui-form layui-form-pane" style="margin-left: 20px;" autocomplete="off">
        <div style="width:100%;height: 90%;overflow: auto;">
            <div class="layui-form-item">
                <fieldset class="layui-elem-field layui-field-title" style="margin-top: 10px;">
                    <legend style="font-size:16px;">输出资产标准列表</legend>
                </fieldset>
            </div>
            <div class="layui-form-item">
                <label for="proBasic" >
                    <span class="x-red">01.</span>项目基础数据表
                    <input type="checkbox" name="check">
                </label>
            </div>
            <div class="layui-form-item">
                <label for="proPro" class="layui-form-label">
                    <span class="x-red">02.</span>项目提案书
                    <input type="checkbox" name="check">
                </label>
            </div>
            <div class="layui-form-item">
                <label for="proQuo" class="layui-form-label">
                    <span class="x-red">03.</span>项目报价书
                    <input type="checkbox" name="check">
                </label>
            </div>
            <div class="layui-form-item">
                <label for="proEst" class="layui-form-label">
                    <span class="x-red">04.</span>项目估算表
                    <input type="checkbox" name="check">
                </label>
            </div>
            <div class="layui-form-item">
                <label for="proPlan" class="layui-form-label">
                    <span class="x-red">05.</span>项目计划书
                    <input type="checkbox" name="check">
                </label>
            </div>
            <div class="layui-form-item">
                <label for="proCut" class="layui-form-label">
                    <span class="x-red">06.</span>项目过程裁剪表
                    <input type="checkbox" name="check">
                </label>
            </div>
            <div class="layui-form-item">
                <label for="proCost" class="layui-form-label">
                    <span class="x-red">07.</span>项目成本管理表
                    <input type="checkbox" name="check">
                </label>
            </div>
            <div class="layui-form-item">
                <label for="proRequest" class="layui-form-label">
                    <span class="x-red">08.</span>项目需求变更管理表
                    <input type="checkbox" name="check">
                </label>
            </div>
            <div class="layui-form-item">
                <label for="proRisk" class="layui-form-label">
                    <span class="x-red">09.</span>项目风险管理表
                    <input type="checkbox" name="check">
                </label>
            </div>
            <div class="layui-form-item">
                <label for="cusAccept" class="layui-form-label">
                    <span class="x-red">10.</span>客户验收问题表
                    <input type="checkbox" name="check">
                </label>
            </div>
            <div class="layui-form-item">
                <label for="cusRepo" class="layui-form-label">
                    <span class="x-red">11.</span>客户验收报告
                    <input type="checkbox" name="check">
                </label>
            </div>
            <div class="layui-form-item">
                <label for="proSummary" class="layui-form-label">
                    <span class="x-red">12.</span>项目总结
                    <input type="checkbox" name="check">
                </label>
            </div>
            <div class="layui-form-item">
                <label for="expLes" class="layui-form-label">
                    <span class="x-red">13.</span>最佳经验和教训
                    <input type="checkbox" name="check">
                </label>
            </div>
            <div class="layui-form-item">
                <label for="devTool" class="layui-form-label">
                    <span class="x-red">14.</span>开发工具
                    <input type="checkbox" name="check">
                </label>
            </div>
            <div class="layui-form-item">
                <label for="devMod" class="layui-form-label">
                    <span class="x-red">15.</span>开发模板（设计模板，测试模板）
                    <input type="checkbox" name="check">
                </label>
            </div>
            <div class="layui-form-item">
                <label for="staCheck" class="layui-form-label">
                    <span class="x-red">16.</span>各阶段检查单
                    <input type="checkbox" name="check">
                </label>
            </div>
            <div class="layui-form-item">
                <label for="qaSum" class="layui-form-label">
                    <span class="x-red">17.</span>QA总结
                    <input type="checkbox" name="check">
                </label>
            </div>
        </div>
        <div style="width: 100%;height: 55px;background-color: white;border-top:1px solid #e6e6e6;
  position: fixed;bottom: 1px;margin-left:-20px;">
            <div class="layui-form-item" style=" float: right;margin-right: 30px;margin-top: 8px">
                <button class="layui-btn layui-btn-normal" onclick="approve_or_reject('确定归档信息审核通过吗？', 'proCheck', '${projectID}')">
                    审核通过
                </button>
            </div>
        </div>
    </form>
</div>
<script>
    document.onkeydown = function (e) { // 回车提交表单
        var theEvent = window.event || e;
        var code = theEvent.keyCode || theEvent.which;
        if (code == 13) {
            $(".select .select-on").click();
        }
    };
    layui.use('table', function () {
        var table = layui.table;
        table.on('tool(proj)', function (obj) {
            var data = obj.data;
            console.log("确定归档信息审核通过吗");
            console.log(data + "\n${projectID}: " + ${projectID} +obj.event);
            if (obj.event === 'pass_pro') {
                approve_or_reject('确定归档信息审核通过吗？', 'proCheck', ${projectID});
            }
        });
    });
    function approve_or_reject(alert_msg, url, projId) {
        console.log("approve_or_reject");
        layui.use('layer', function () {
            var layer = layui.layer;
            console.log("approve_or_reject-----------");
            layer.msg(alert_msg, {
                time: 5000,//5秒自动关闭
                btn: ['确定', '取消'],
                yes: function (index) {
                    $.ajax({
                        url: url,
                        data: {
                            'projId': projId
                        },
                        type: "POST",
                        dataType: "json",
                        success: function (data) {
                            var index = parent.layer.getFrameIndex(window.name);
                            window.top.layer.msg(data.msg, {icon: 6, offset: 'rb', area: ['120px', '80px'], anim: 2});
                            parent.layer.close(index);
                            parent.location.replace(parent.location.href);
                        }, error: function () {
                            var index = parent.layer.getFrameIndex(window.name);
                            window.top.layer.msg('请求失败', {icon: 5, offset: 'rb', area: ['120px', '80px'], anim: 2});
                            parent.layer.close(index);
                        }
                    });
                    layer.close(index);
                }
            });
        });
    }


</script>
</body>
</html>