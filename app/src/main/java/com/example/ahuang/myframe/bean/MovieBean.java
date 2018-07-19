package com.example.ahuang.myframe.bean; /**
 * MovieBean  2018-07-10
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 07 10
 */
public class MovieBean {


    /**
     * count : 10
     * start : 0
     * total : 26
     * subjects : [{"rating":{"max":10,"average":9,"details":{"1":114,"2":251,"3":3669,"4":20257,"5":31198},"stars":"45","min":0},"genres":["剧情","喜剧"],"title":"我不是药神","casts":[{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43738.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43738.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43738.webp"},"name_en":"Zheng Xu","name":"徐峥","alt":"https://movie.douban.com/celebrity/1274297/","id":"1274297"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1496577458.38.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1496577458.38.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1496577458.38.webp"},"name_en":"Chuanjun Wang","name":"王传君","alt":"https://movie.douban.com/celebrity/1313837/","id":"1313837"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1514533436.1.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1514533436.1.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1514533436.1.webp"},"name_en":"Yiwei Zhou","name":"周一围","alt":"https://movie.douban.com/celebrity/1276085/","id":"1276085"}],"durations":["117分钟"],"collect_count":409998,"mainland_pubdate":"2018-07-05","has_video":false,"original_title":"我不是药神","subtype":"movie","directors":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529658740.26.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529658740.26.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529658740.26.webp"},"name_en":"Muye Wen","name":"文牧野","alt":"https://movie.douban.com/celebrity/1349765/","id":"1349765"}],"pubdates":["2018-06-30(大规模点映)","2018-07-05(中国大陆)"],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2519070834.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2519070834.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2519070834.webp"},"alt":"https://movie.douban.com/subject/26752088/","id":"26752088"},{"rating":{"max":10,"average":7.3,"details":{"1":243,"2":919,"3":6069,"4":8656,"5":2359},"stars":"40","min":0},"genres":["剧情","动作","冒险"],"title":"动物世界","casts":[{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1403196522.98.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1403196522.98.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1403196522.98.webp"},"name_en":"Yifeng Li","name":"李易峰","alt":"https://movie.douban.com/celebrity/1314140/","id":"1314140"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4023.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4023.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4023.webp"},"name_en":"Michael Douglas","name":"迈克尔·道格拉斯","alt":"https://movie.douban.com/celebrity/1053620/","id":"1053620"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p36798.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p36798.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p36798.webp"},"name_en":"Dongyu Zhou","name":"周冬雨","alt":"https://movie.douban.com/celebrity/1274224/","id":"1274224"}],"durations":["132分钟"],"collect_count":113427,"mainland_pubdate":"2018-06-29","has_video":false,"original_title":"动物世界","subtype":"movie","directors":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p38015.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p38015.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p38015.webp"},"name_en":"Yan Han ","name":"韩延","alt":"https://movie.douban.com/celebrity/1314828/","id":"1314828"}],"pubdates":["2018-06-29(中国大陆)"],"year":"2018","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2525528688.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2525528688.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2525528688.webp"},"alt":"https://movie.douban.com/subject/26925317/","id":"26925317"},{"rating":{"max":10,"average":6.9,"details":{"1":368,"2":2548,"3":17130,"4":12664,"5":2975},"stars":"35","min":0},"genres":["动作","科幻","冒险"],"title":"侏罗纪世界2","casts":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408711300.32.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408711300.32.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408711300.32.webp"},"name_en":"Chris Pratt","name":"克里斯·帕拉特","alt":"https://movie.douban.com/celebrity/1017967/","id":"1017967"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p315.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p315.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p315.webp"},"name_en":"Bryce Dallas Howard","name":"布莱丝·达拉斯·霍华德","alt":"https://movie.douban.com/celebrity/1027772/","id":"1027772"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1523860646.23.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1523860646.23.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1523860646.23.webp"},"name_en":"Justice Smith","name":"贾斯蒂斯·史密斯","alt":"https://movie.douban.com/celebrity/1350981/","id":"1350981"}],"durations":["128分钟"],"collect_count":154477,"mainland_pubdate":"2018-06-15","has_video":false,"original_title":"Jurassic World: Fallen Kingdom","subtype":"movie","directors":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372318484.25.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372318484.25.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372318484.25.webp"},"name_en":"Juan Antonio Bayona","name":"胡安·安东尼奥·巴亚纳","alt":"https://movie.douban.com/celebrity/1305510/","id":"1305510"}],"pubdates":["2018-06-15(中国大陆)","2018-06-22(美国)"],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522069454.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522069454.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522069454.webp"},"alt":"https://movie.douban.com/subject/26416062/","id":"26416062"},{"rating":{"max":10,"average":5,"details":{"1":16,"2":23,"3":31,"4":8,"5":3},"stars":"25","min":0},"genres":["儿童","动画","冒险"],"title":"新大头儿子和小头爸爸3：俄罗斯奇遇记","casts":[{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p44177.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p44177.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p44177.webp"},"name_en":"Chunyan Liu","name":"刘纯燕","alt":"https://movie.douban.com/celebrity/1318433/","id":"1318433"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p44180.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p44180.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p44180.webp"},"name_en":"Hao Dong","name":"董浩","alt":"https://movie.douban.com/celebrity/1318435/","id":"1318435"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1494778054.15.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1494778054.15.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1494778054.15.webp"},"name_en":"Ping Ju","name":"鞠萍","alt":"https://movie.douban.com/celebrity/1274251/","id":"1274251"}],"durations":["80分钟"],"collect_count":867,"mainland_pubdate":"2018-07-06","has_video":false,"original_title":"新大头儿子和小头爸爸3：俄罗斯奇遇记","subtype":"movie","directors":[{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1469705072.9.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1469705072.9.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1469705072.9.webp"},"name_en":"Cheng He","name":"何澄","alt":"https://movie.douban.com/celebrity/1342907/","id":"1342907"}],"pubdates":["2018-07-06(中国大陆)"],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522820714.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522820714.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522820714.webp"},"alt":"https://movie.douban.com/subject/30198729/","id":"30198729"},{"rating":{"max":10,"average":8.1,"details":{"1":30,"2":276,"3":4225,"4":9328,"5":5570},"stars":"40","min":0},"genres":["喜剧","动作","动画"],"title":"超人总动员2","casts":[{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21297.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21297.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21297.webp"},"name_en":"Craig T. Nelson","name":"格雷格·T·尼尔森","alt":"https://movie.douban.com/celebrity/1002721/","id":"1002721"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p48614.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p48614.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p48614.webp"},"name_en":"Holly Hunter","name":"霍利·亨特","alt":"https://movie.douban.com/celebrity/1031838/","id":"1031838"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529654136.33.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529654136.33.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529654136.33.webp"},"name_en":"Sarah Vowell","name":"莎拉·沃威尔","alt":"https://movie.douban.com/celebrity/1186797/","id":"1186797"}],"durations":["118分钟","126分钟(中国大陆)"],"collect_count":74369,"mainland_pubdate":"2018-06-22","has_video":false,"original_title":"Incredibles 2","subtype":"movie","directors":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529655910.45.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529655910.45.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529655910.45.webp"},"name_en":"Brad Bird","name":"布拉德·伯德","alt":"https://movie.douban.com/celebrity/1027204/","id":"1027204"}],"pubdates":["2018-06-15(美国)","2018-06-22(中国大陆)"],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522880251.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522880251.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522880251.webp"},"alt":"https://movie.douban.com/subject/25849049/","id":"25849049"},{"rating":{"max":10,"average":3.2,"details":{"1":1388,"2":801,"3":265,"4":26,"5":9},"stars":"15","min":0},"genres":["动作","惊悚"],"title":"金蝉脱壳2：冥府","casts":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p262.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p262.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p262.webp"},"name_en":"Sylvester Stallone","name":"西尔维斯特·史泰龙","alt":"https://movie.douban.com/celebrity/1047996/","id":"1047996"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1472787652.32.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1472787652.32.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1472787652.32.webp"},"name_en":"Xiaoming Huang","name":"黄晓明","alt":"https://movie.douban.com/celebrity/1041404/","id":"1041404"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1493202154.34.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1493202154.34.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1493202154.34.webp"},"name_en":"Dave Bautista","name":"戴夫·巴蒂斯塔","alt":"https://movie.douban.com/celebrity/1014003/","id":"1014003"}],"durations":["93分钟"],"collect_count":18200,"mainland_pubdate":"2018-06-29","has_video":false,"original_title":"Escape Plan 2: Hades","subtype":"movie","directors":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1473210941.06.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1473210941.06.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1473210941.06.webp"},"name_en":"Steven C. Miller","name":"史蒂芬·C·米勒","alt":"https://movie.douban.com/celebrity/1032824/","id":"1032824"}],"pubdates":["2018-06-13(菲律宾)","2018-06-29(中国大陆)"],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2524134770.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2524134770.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2524134770.webp"},"alt":"https://movie.douban.com/subject/26905469/","id":"26905469"},{"rating":{"max":10,"average":5.5,"details":{"1":9,"2":9,"3":16,"4":3,"5":7},"stars":"30","min":0},"genres":["纪录片"],"title":"您一定不要错过","casts":[{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1524126104.69.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1524126104.69.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1524126104.69.webp"},"name_en":"Yongyuan Cui","name":"崔永元","alt":"https://movie.douban.com/celebrity/1315258/","id":"1315258"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p33449.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p33449.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p33449.webp"},"name_en":"Xingang Wang","name":"王心刚","alt":"https://movie.douban.com/celebrity/1163063/","id":"1163063"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p20607.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p20607.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p20607.webp"},"name_en":"Xiaotang Wang","name":"王晓棠","alt":"https://movie.douban.com/celebrity/1017754/","id":"1017754"}],"durations":["99分钟"],"collect_count":1133,"mainland_pubdate":"2018-07-06","has_video":false,"original_title":"您一定不要错过","subtype":"movie","directors":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372142956.93.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372142956.93.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372142956.93.webp"},"name_en":"Lisi Mai","name":"麦丽丝","alt":"https://movie.douban.com/celebrity/1290135/","id":"1290135"}],"pubdates":["2018-07-06(中国大陆)"],"year":"2018","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2526892057.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2526892057.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2526892057.webp"},"alt":"https://movie.douban.com/subject/30255216/","id":"30255216"},{"rating":{"max":10,"average":3.8,"details":{"1":341,"2":190,"3":155,"4":20,"5":19},"stars":"20","min":0},"genres":["喜剧","动作"],"title":"猛虫过江","casts":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34055.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34055.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34055.webp"},"name_en":"Xiao Shen-Yang","name":"小沈阳","alt":"https://movie.douban.com/celebrity/1274081/","id":"1274081"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p36063.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p36063.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p36063.webp"},"name_en":"Bin-long Pan","name":"潘斌龙","alt":"https://movie.douban.com/celebrity/1316365/","id":"1316365"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1446281965.79.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1446281965.79.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1446281965.79.webp"},"name_en":"Vivian Sung","name":"宋芸桦","alt":"https://movie.douban.com/celebrity/1341903/","id":"1341903"}],"durations":["99分钟"],"collect_count":10244,"mainland_pubdate":"2018-06-15","has_video":false,"original_title":"猛虫过江","subtype":"movie","directors":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34055.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34055.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34055.webp"},"name_en":"Xiao Shen-Yang","name":"小沈阳","alt":"https://movie.douban.com/celebrity/1274081/","id":"1274081"}],"pubdates":["2018-06-15(中国大陆)"],"year":"2018","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2523437699.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2523437699.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2523437699.webp"},"alt":"https://movie.douban.com/subject/26818314/","id":"26818314"},{"rating":{"max":10,"average":0,"details":{"1":0,"2":0,"3":0,"4":0,"5":0},"stars":"00","min":0},"genres":["惊悚","恐怖"],"title":"细思极恐","casts":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21430.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21430.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21430.webp"},"name_en":"So-won Ham","name":"韩素媛","alt":"https://movie.douban.com/celebrity/1178533/","id":"1178533"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527647410.08.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527647410.08.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527647410.08.webp"},"name_en":"Lanbo","name":"蓝波","alt":"https://movie.douban.com/celebrity/1364829/","id":"1364829"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527658154.64.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527658154.64.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527658154.64.webp"},"name_en":"Beitong Pang","name":"庞贝童","alt":"https://movie.douban.com/celebrity/1394380/","id":"1394380"}],"durations":["92分钟"],"collect_count":99,"mainland_pubdate":"2018-07-06","has_video":false,"original_title":"细思极恐","subtype":"movie","directors":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527746059.06.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527746059.06.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527746059.06.webp"},"name_en":"Yuebin Zhang","name":"张跃斌","alt":"https://movie.douban.com/celebrity/1394332/","id":"1394332"}],"pubdates":["2018-07-06(中国大陆)"],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2523632181.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2523632181.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2523632181.webp"},"alt":"https://movie.douban.com/subject/30235134/","id":"30235134"},{"rating":{"max":10,"average":8.5,"details":{"1":124,"2":576,"3":9916,"4":36016,"5":30009},"stars":"45","min":0},"genres":["犯罪","剧情","爱情"],"title":"阿飞正传","casts":[{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p67.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p67.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p67.webp"},"name_en":"Leslie Cheung","name":"张国荣","alt":"https://movie.douban.com/celebrity/1003494/","id":"1003494"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p793.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p793.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p793.webp"},"name_en":"Maggie Cheung","name":"张曼玉","alt":"https://movie.douban.com/celebrity/1274231/","id":"1274231"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1411832447.57.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1411832447.57.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1411832447.57.webp"},"name_en":"Carina Lau","name":"刘嘉玲","alt":"https://movie.douban.com/celebrity/1036905/","id":"1036905"}],"durations":["94分钟"],"collect_count":287355,"mainland_pubdate":"2018-06-25","has_video":false,"original_title":"阿飛正傳","subtype":"movie","directors":[{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1418226223.7.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1418226223.7.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1418226223.7.webp"},"name_en":"Kar Wai Wong","name":"王家卫","alt":"https://movie.douban.com/celebrity/1041024/","id":"1041024"}],"pubdates":["1990-12-15(香港)","2018-06-25(中国大陆)"],"year":"1990","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2525770523.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2525770523.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2525770523.webp"},"alt":"https://movie.douban.com/subject/1305690/","id":"1305690"}]
     * title : 正在上映的电影-深圳
     */

    private int count;
    private int start;
    private int total;
    private String title;
    private List<SubjectsBean> subjects;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubjectsBean> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectsBean> subjects) {
        this.subjects = subjects;
    }

    public static class SubjectsBean {
        /**
         * rating : {"max":10,"average":9,"details":{"1":114,"2":251,"3":3669,"4":20257,"5":31198},"stars":"45","min":0}
         * genres : ["剧情","喜剧"]
         * title : 我不是药神
         * casts : [{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43738.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43738.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43738.webp"},"name_en":"Zheng Xu","name":"徐峥","alt":"https://movie.douban.com/celebrity/1274297/","id":"1274297"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1496577458.38.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1496577458.38.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1496577458.38.webp"},"name_en":"Chuanjun Wang","name":"王传君","alt":"https://movie.douban.com/celebrity/1313837/","id":"1313837"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1514533436.1.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1514533436.1.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1514533436.1.webp"},"name_en":"Yiwei Zhou","name":"周一围","alt":"https://movie.douban.com/celebrity/1276085/","id":"1276085"}]
         * durations : ["117分钟"]
         * collect_count : 409998
         * mainland_pubdate : 2018-07-05
         * has_video : false
         * original_title : 我不是药神
         * subtype : movie
         * directors : [{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529658740.26.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529658740.26.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529658740.26.webp"},"name_en":"Muye Wen","name":"文牧野","alt":"https://movie.douban.com/celebrity/1349765/","id":"1349765"}]
         * pubdates : ["2018-06-30(大规模点映)","2018-07-05(中国大陆)"]
         * year : 2018
         * images : {"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2519070834.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2519070834.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2519070834.webp"}
         * alt : https://movie.douban.com/subject/26752088/
         * id : 26752088
         */

        private RatingBean rating;
        private String title;
        private int collect_count;
        private String mainland_pubdate;
        private boolean has_video;
        private String original_title;
        private String subtype;
        private String year;
        private ImagesBean images;
        private String alt;
        private String id;
        private List<String> genres;
        private List<CastsBean> casts;
        private List<String> durations;
        private List<DirectorsBean> directors;
        private List<String> pubdates;

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getCollect_count() {
            return collect_count;
        }

        public void setCollect_count(int collect_count) {
            this.collect_count = collect_count;
        }

        public String getMainland_pubdate() {
            return mainland_pubdate;
        }

        public void setMainland_pubdate(String mainland_pubdate) {
            this.mainland_pubdate = mainland_pubdate;
        }

        public boolean isHas_video() {
            return has_video;
        }

        public void setHas_video(boolean has_video) {
            this.has_video = has_video;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public String getSubtype() {
            return subtype;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<String> getGenres() {
            return genres;
        }

        public void setGenres(List<String> genres) {
            this.genres = genres;
        }

        public List<CastsBean> getCasts() {
            return casts;
        }

        public void setCasts(List<CastsBean> casts) {
            this.casts = casts;
        }

        public List<String> getDurations() {
            return durations;
        }

        public void setDurations(List<String> durations) {
            this.durations = durations;
        }

        public List<DirectorsBean> getDirectors() {
            return directors;
        }

        public void setDirectors(List<DirectorsBean> directors) {
            this.directors = directors;
        }

        public List<String> getPubdates() {
            return pubdates;
        }

        public void setPubdates(List<String> pubdates) {
            this.pubdates = pubdates;
        }

        public static class RatingBean {
            /**
             * max : 10
             * average : 9
             * details : {"1":114,"2":251,"3":3669,"4":20257,"5":31198}
             * stars : 45
             * min : 0
             */

            private int max;
            private int average;
            private DetailsBean details;
            private String stars;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public int getAverage() {
                return average;
            }

            public void setAverage(int average) {
                this.average = average;
            }

            public DetailsBean getDetails() {
                return details;
            }

            public void setDetails(DetailsBean details) {
                this.details = details;
            }

            public String getStars() {
                return stars;
            }

            public void setStars(String stars) {
                this.stars = stars;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }

            public static class DetailsBean {
                /**
                 * 1 : 114
                 * 2 : 251
                 * 3 : 3669
                 * 4 : 20257
                 * 5 : 31198
                 */

                @SerializedName("1")
                private int _$1;
                @SerializedName("2")
                private int _$2;
                @SerializedName("3")
                private int _$3;
                @SerializedName("4")
                private int _$4;
                @SerializedName("5")
                private int _$5;

                public int get_$1() {
                    return _$1;
                }

                public void set_$1(int _$1) {
                    this._$1 = _$1;
                }

                public int get_$2() {
                    return _$2;
                }

                public void set_$2(int _$2) {
                    this._$2 = _$2;
                }

                public int get_$3() {
                    return _$3;
                }

                public void set_$3(int _$3) {
                    this._$3 = _$3;
                }

                public int get_$4() {
                    return _$4;
                }

                public void set_$4(int _$4) {
                    this._$4 = _$4;
                }

                public int get_$5() {
                    return _$5;
                }

                public void set_$5(int _$5) {
                    this._$5 = _$5;
                }
            }
        }

        public static class ImagesBean {
            /**
             * small : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2519070834.webp
             * large : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2519070834.webp
             * medium : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2519070834.webp
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }

        public static class CastsBean {
            /**
             * avatars : {"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43738.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43738.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43738.webp"}
             * name_en : Zheng Xu
             * name : 徐峥
             * alt : https://movie.douban.com/celebrity/1274297/
             * id : 1274297
             */

            private AvatarsBean avatars;
            private String name_en;
            private String name;
            private String alt;
            private String id;

            public AvatarsBean getAvatars() {
                return avatars;
            }

            public void setAvatars(AvatarsBean avatars) {
                this.avatars = avatars;
            }

            public String getName_en() {
                return name_en;
            }

            public void setName_en(String name_en) {
                this.name_en = name_en;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public static class AvatarsBean {
                /**
                 * small : https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43738.webp
                 * large : https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43738.webp
                 * medium : https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43738.webp
                 */

                private String small;
                private String large;
                private String medium;

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }
            }
        }

        public static class DirectorsBean {
            /**
             * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529658740.26.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529658740.26.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529658740.26.webp"}
             * name_en : Muye Wen
             * name : 文牧野
             * alt : https://movie.douban.com/celebrity/1349765/
             * id : 1349765
             */

            private AvatarsBeanX avatars;
            private String name_en;
            private String name;
            private String alt;
            private String id;

            public AvatarsBeanX getAvatars() {
                return avatars;
            }

            public void setAvatars(AvatarsBeanX avatars) {
                this.avatars = avatars;
            }

            public String getName_en() {
                return name_en;
            }

            public void setName_en(String name_en) {
                this.name_en = name_en;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public static class AvatarsBeanX {
                /**
                 * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529658740.26.webp
                 * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529658740.26.webp
                 * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529658740.26.webp
                 */

                private String small;
                private String large;
                private String medium;

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }
            }
        }
    }
}

