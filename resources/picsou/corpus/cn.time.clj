(
  ; Context map
  ; Tuesday Feb 12, 2013 at 4:30am is the "now" for the tests
  {:reference-time (time/t -2 2013 2 12 4 30 0)}

  "现在"
  "此时"
  "此刻"
  "当前"
  "現在"
  "此時"
  "當前"
  (datetime 2013 2 12 4 30 00)
  
  "今天"
  (datetime 2013 2 12)

  "昨天"
  (datetime 2013 2 11)

  "明天"
  (datetime 2013 2 13)

  "后天"
  "後天"
  (datetime 2013 2 14)
  
  "前天"
  (datetime 2013 2 10)

  "星期一"
  "礼拜一"
  "周一"
  "禮拜一"
  "週一"
  (datetime 2013 2 18)

  "星期二"
  "礼拜二"
  "周二"
  "禮拜二"
  "週二"
  (datetime 2013 2 19)

  "星期三"
  "礼拜三"
  "周三"
  "禮拜三"
  "週三"
  (datetime 2013 2 13)

  "星期四"
  "礼拜四"
  "周四"
  "禮拜四"
  "週四"
  (datetime 2013 2 14)

  "星期五"
  "礼拜五"
  "周五"
  "禮拜五"
  "週五"
  (datetime 2013 2 15)

  "星期六"
  "礼拜六"
  "周六"
  "禮拜六"
  "週六"
  (datetime 2013 2 16)

  "星期日"
  "星期天"
  "礼拜天"
  "周日"
  "禮拜天"
  "週日"
  (datetime 2013 2 17)

  "这周末"
  "這週末"
  (datetime-interval [2013 2 15 18] [2013 2 18 00])

  "周一早上"
  "周一早晨"
  "礼拜一早上"
  "礼拜一早晨"
  "週一早上"
  "週一早晨"
  "禮拜一早上"
  "禮拜一早晨"
  (datetime-interval [2013 2 18 4] [2013 2 18 12])

  "上周日"
  "上星期天"
  "上礼拜天"
  "上週日"
  "上星期天"
  "上禮拜天"
  (datetime 2013 2 10)

  "周日, 二月十号"
  "星期天, 二月十号"
  "礼拜天, 二月十号"
  "週日, 二月十號"
  "星期天, 二月十號"
  "禮拜天, 二月十號"
  (datetime 2019 2 10) ; with current look-forward default...

  "上周二"
  "上礼拜二"
  "上週二"
  "上禮拜二"
  (datetime 2013 2 5)

  "三月一号"
  "三月一日"
  "三月一號"
  (datetime 2013 3 1)

  "2015年3月3号"
  "2015年3月三号"
  "2015年三月3号"
  "2015年三月三号"
  "2015年3月3號"
  "2015年3月三號"
  "2015年三月3號"
  "2015年三月三號"
  "3/3/2015"
  "3/3/15"
  "2015-3-3"
  "2015-03-03"
  (datetime 2015 3 3)

  "2013年2月15号"
  "2013年二月十五号"
  "2月15号"
  "二月十五号"
  "2013年2月15號"
  "2013年二月十五號"
  "2月15號"
  "二月十五號"
  "2/15"
  (datetime 2013 2 15)
  
  "10/31/1974"
  "10/31/74"
  (datetime 1974 10 31)

  "二月十五号早上"
  "二月十五号早晨"
  "2月15号早上"
  "2月15号早晨"
  "二月十五號早上"
  "二月十五號早晨"
  "2月15號早上"
  "2月15號早晨"
  (datetime-interval [2013 2 15 4] [2013 2 15 12])

  "下周二" ; when today is Tuesday, "mardi prochain" is a week from now
  "这礼拜二"
  "下週二"
  "這禮拜二"
  (datetime 2013 2 19)

  "这周三" ; when today is Tuesday, "mercredi prochain" is tomorrow
  "这礼拜三"
  "這週三"
  "這禮拜三"
  (datetime 2013 2 13)

  "下周三"
  "下礼拜三"
  "下週三"
  "下禮拜三"
  (datetime 2013 2 13)

  "这周一"
  "这礼拜一"
  "這週一"
  "這禮拜一"
  (datetime 2013 2 18)

  "这周二"
  "这礼拜二"
  "這週二"
  "這禮拜二"
  (datetime 2013 2 19)

  "这周"
  "这一周"
  "这礼拜"
  "这一礼拜"
  "這週"
  "這一周"
  "這禮拜"
  "這一禮拜"
  (datetime 2013 2 11 :grain :week)
  
  "上周"
  "上週"
  (datetime 2013 2 4 :grain :week)
  
  "下周"
  "下週"
  (datetime 2013 2 18 :grain :week)
  
  "上月"
  "上个月"
  "上個月"
  (datetime 2013 1)

  "下月"
  "下个月"
  "下個月"
  (datetime 2013 3)
  
  "去年"
  (datetime 2012)
  
  "今年"
  "这一年"
  "這一年"
  (datetime 2013)
  
  "明年"
  (datetime 2014)
  
  "上两秒"
  "上二秒"
  "前两秒"
  "前二秒"
  "上兩秒"
  "前兩秒"
  (datetime-interval [2013 2 12 4 29 58] [2013 2 12 4 30 00])

  "下三秒"
  "后三秒"
  "後三秒"
  (datetime-interval [2013 2 12 4 30 01] [2013 2 12 4 30 04])

  "上两分钟"
  "上二分钟"
  "前两分钟"
  "前二分钟"
  "上兩分鐘"
  "上二分鐘"
  "前兩分鐘"
  "前二分鐘"
  (datetime-interval [2013 2 12 4 28] [2013 2 12 4 30])

  "下三分钟"
  "后三分钟"
  "下三分鐘"
  "後三分鐘"
  (datetime-interval [2013 2 12 4 31] [2013 2 12 4 34])

  "上两小时"
  "上二小时"
  "前两小时"
  "前二小时"
  "上兩小時"
  "上二小時"
  "前兩小時"
  "前二小時"
  (datetime-interval [2013 2 12 3] [2013 2 12 4])

  "下三小时"
  "后三小时"
  "下三小時"
  "後三小時"
  (datetime-interval [2013 2 12 5] [2013 2 12 8])

  "上两天"
  "前两天"
  "上兩天"
  "前兩天"
  (datetime-interval [2013 2 10] [2013 2 12])

  "下三天"
  "后三天"
  "後三天"
  (datetime-interval [2013 2 13] [2013 2 16])
    
  "上两周"
  "上二周"
  "上兩週"
  "上二週"
  (datetime-interval [2013 1 28 :grain :week] [2013 2 11 :grain :week])


  "下三周"
  "下三个周"
  "下三週"
  "下三個週"
  (datetime-interval [2013 2 18 :grain :week] [2013 3 11 :grain :week])

  "上两个月"
  "上二个月"
  "上二月"
  "前两个月"
  "前二个月"
  "前两月"
  "上兩個月"
  "上二個月"
  "前兩個月"
  "前二個月"
  "前兩月"
  (datetime-interval [2012 12] [2013 02])

  "下三个月"
  "后三个月"
  "後三個月"
  (datetime-interval [2013 3] [2013 6])

  "前两年"
  "前兩年"
  (datetime-interval [2011] [2013])
  
  "下三年"
  (datetime-interval [2014] [2017])
  

  "三点"
  "3pm"
  "三點"
  (datetime 2013 2 12 15)

  "下午三点十五"
  "下午3:15"
  "15:15"
  "3:15pm"
  "3:15PM"
  "3:15p"
  "下午三點十五"
  (datetime 2013 2 12 15 15

  "下午三点二十分"
  "下午3:20"
  "3:20p"
  "下午三點二十分"
  (datetime 2013 2 12 15 20)

  "下午三点半"
  "15:30"
  "3:30pm"
  "3:30PM"
  "下午三點半"
  (datetime 2013 2 12 15 30)

  "中午差一刻"
  "中午差十五分钟"
  "十二点差一刻"
  "十二点差十五分钟"
  "11:45am"
  "中午差十五分鐘"
  "十二點差一刻"
  "十二點差十五分鐘"
  (datetime 2013 2 12 11 45)
  
  "九月二十号7:30 PM"
  "九月二十號7:30 PM"
  (datetime 2013 9 20 19 30)
  
  "周六9am"
  "周六早上9点"
  "周六早上九点"
  "週六9am"
  "週六早上9點"
  "週六早上九點"
  (datetime 2013 2 16 9)
  
  "今晚"
  (datetime-interval [2013 2 12 18] [2013 2 13 00])

  "明晚"
  "周三晚上"
  "明天晚上"
  "週三晚上"
  (datetime-interval [2013 2 13 18] [2013 2 14 00])
  
  "昨晚"
  "昨天晚上"
  (datetime-interval [2013 2 11 18] [2013 2 12 00])
  
  "再一秒"
  (datetime 2013 2 12 4 30 1)
  
  "再一分钟"
  "再一分鐘"
  (datetime 2013 2 12 4 31)
  
  "再两分钟"
  "再兩分鐘"
  (datetime 2013 2 12 4 32)
  
  "再六十分钟"
  "再六十分鐘"
  (datetime 2013 2 12 5 30)
  
  "再一小时"
  "再一小時"
  (datetime 2013 2 12 5 30 - 6 30)

  "再二十四小时"
  "再二十四小時"
  (datetime 2013 2 13 4 30)
  
  "再一天"
  (datetime 2013 2 13 4 30 - 14 4 30)

  "再七天"
  (datetime 2013 2 19 4)

  "再一周"
  "再一礼拜"
  "再一禮拜"
  (datetime 2013 2 19)

  "七天前"
  (datetime 2013 2 5 4)
  
  "一周前"
  "一礼拜前"
  "一禮拜前"
  (datetime 2013 2 5)

  "三周前"
  "三礼拜前"
  "三週前"
  "三禮拜前"
  (datetime 2013 1 22)
  
  "三个月前"
  "三個月前"
  (datetime 2012 11 12)

  "两年前"
  "兩年前"
  (datetime 2011 2)
  
  "4pm PST")
  (datetime 2013 2 12 16 :hour 4 :meridiem :pm :timezone "PST")

  "2015年4月14号"
  (datetime 2015 4 14 :month 4 :day 14 :year 2015)

  "今晚8点"
  "今晚八点"
  "今晚8點"
  "今晚八點"
  (datetime 2013 2 12 20 :hour 8)

  "元旦"
  "元旦节"
  "元旦節"
  (datetime 2014 1 1)

  "情人节"
  "情人節"
  (datetime 2013 2 14)

  "妇女节"
  "婦女節"
  (datetime 2013 3 8)

  "劳动节"
  "勞動節"
  (datetime 2013 5 1)

  "儿童节"
  "兒童節"
  (datetime 2013 6 1)

  "建军节"
  "建軍節"
  (datetime 2013 8 1)

  "国庆"
  "國慶"
  "国庆节"
  "國慶節"
  (datetime 2013 10 1)

  "圣诞"
  "聖誕"
  "圣诞节"
  "聖誕節"
  (datetime 2013 12 25)

  "国庆节晚上"
  "國慶節晚上"
  (datetime-interval [2013 10 1 18] [2013 10 2 00])

  "儿童节下午三点十五"
  "兒童節下午三點十五"
  (datetime 2013 6 1 15 15)
)