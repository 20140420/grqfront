//<![CDATA[ 
window.onload=function(){
KISSY.Config.combine = true;
KISSY.use("gallery/kcharts/1.2/linechart/index",function(S,LineChart){
  var linechart = new LineChart({
      renderTo:"#demo1",
      points:{
        attr:{
          type:"auto"
        }
      },
      yLabels:{
        css:{
          "marginLeft":"-4px",
          "font-family":"Microsoft Yahei",
          "font-size":"10px"
        }
      },
      xLabels:{
        css:{
          "font-family":"Microsoft Yahei",
           "font-size":"10px"
        }
      },
      title:{
              content:"银币成交价"
            },
            anim:{},
            subTitle:{
              content:"数据来源: www.guruquan.com"
            },
            lineType:"arc",
       xAxis: {
          text:['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
                    'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
            },
            yAxis:{
              num:7
            },
          comparable:true,
      series:[{
				text: '最高买盘',
                data: [110, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110]
            }, {
                text: '成交价',
                data: [99, 95, 101, 108, 103, 90, 97, 91, 90, 90, 90, 96]
            }
            , {
                
				text: '最低卖盘',
                data: [90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90]
            }
            ],
      legend:{
        isShow:true,y:-10
      },
      tip:{
        offset:{
                    x:10,
                    y:10
                },
        template:function(e){
          var html = "";
          for(var i in e.datas){
            html +="<span style='font-size:10px;color:"+e.datas[i]['color']+"'>"+e.datas[i]['text'] +" "+e.datas[i]['y']+" ㄓ/10元</span><br/>"
          }
          return html;
        }
      }
  });

});
}//]]>