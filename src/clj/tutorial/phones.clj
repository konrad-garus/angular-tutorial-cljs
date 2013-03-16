(ns tutorial.phones)

(def phones
  [{:age 0 
    :id "motorola-xoom-with-wi-fi"
    :image_url "img/phones/motorola-xoom-with-wi-fi.0.jpg" 
    :name "Motorola XOOM\u2122 with Wi-Fi"
    :snippet "The Next, Next Generation\r\n\r\nExperience the future with Motorola XOOM with Wi-Fi, the world's first tablet powered by Android 3.0 (Honeycomb)."} 
   {:age 1
    :id "motorola-xoom"
    :image_url "img/phones/motorola-xoom.0.jpg" 
    :name "MOTOROLA XOOM\u2122"
    :snippet "The Next, Next Generation\n\nExperience the future with MOTOROLA XOOM, the world's first tablet powered by Android 3.0 (Honeycomb)."} 
   {:age 2
    :carrier "AT&amp;T"
    :id "motorola-atrix-4g"
    :image_url "img/phones/motorola-atrix-4g.0.jpg" 
    :name "MOTOROLA ATRIX\u2122 4G" 
    :snippet "MOTOROLA ATRIX 4G the world's most powerful smartphone."}])

(def phone-details
  {:motorola-xoom-with-wi-fi 
   {:additionalFeatures "Sensors: proximity, ambient light, barometer, gyroscope", 
    :android {
              :os "Android 3.0", 
              :ui "Honeycomb"}, 
    :availability [""], 
    :battery {
              :standbyTime "336 hours", 
              :talkTime "24 hours", 
              :type "Other ( mAH)"}, 
    :camera {
             :features ["Flash" "Video"], 
             :primary "5.0 megapixels"}, 
    :connectivity {
                   :bluetooth "Bluetooth 2.1", 
                   :cell "", 
                   :gps true, 
                   :infrared false, 
                   :wifi "802.11 b/g/n"
                   }, 
    :description "Motorola XOOM with Wi-Fi has a super-powerful dual-core processor and Android\u2122 3.0 (Honeycomb) \u2014 the Android platform designed specifically for tablets. With its 10.1-inch HD widescreen display, you\u2019ll enjoy HD video in a thin, light, powerful and upgradeable tablet.", 
    :display {
              :screenResolution "WXGA (1200 x 800)", 
              :screenSize "10.1 inches", 
              :touchScreen true
              }, 
    :hardware {
               :accelerometer true, 
               :audioJack "3.5mm", 
               :cpu "1 GHz Dual Core Tegra 2", 
               :fmRadio false, 
               :physicalKeyboard false, 
               :usb "USB 2.0"
               }, 
    :id "motorola-xoom-with-wi-fi", 
    :images [
             "img/phones/motorola-xoom-with-wi-fi.0.jpg", 
             "img/phones/motorola-xoom-with-wi-fi.1.jpg", 
             "img/phones/motorola-xoom-with-wi-fi.2.jpg", 
             "img/phones/motorola-xoom-with-wi-fi.3.jpg", 
             "img/phones/motorola-xoom-with-wi-fi.4.jpg", 
             "img/phones/motorola-xoom-with-wi-fi.5.jpg"
             ], 
    :name "Motorola XOOM\u2122 with Wi-Fi", 
    :sizeAndWeight {
                    :dimensions [
                                 "249.1 mm (w)", 
                                 "167.8 mm (h)", 
                                 "12.9 mm (d)"
                                 ], 
                    :weight "708.0 grams"
                    }, 
    :storage {
              :flash "32000MB", 
              :ram "1000MB"
              }
    }
   
   :motorola-xoom {
                   :additionalFeatures "Front-facing camera. Sensors: proximity, ambient light, barometer, gyroscope.", 
                   :android {
                             :os "Android 3.0", 
                             :ui "Android"
                             }, 
                   :availability [
                                  "Verizon"
                                  ], 
                   :battery {
                             :standbyTime "336 hours", 
                             :talkTime "24 hours", 
                             :type "Other (3250 mAH)"
                             }, 
                   :camera {
                            :features [
                                       "Flash", 
                                       "Video"
                                       ], 
                            :primary "5.0 megapixels"
                            }, 
                   :connectivity {
                                  :bluetooth "Bluetooth 2.1", 
                                  :cell "CDMA 800 /1900 LTE 700, Rx diversity in all bands", 
                                  :gps true, 
                                  :infrared false, 
                                  :wifi "802.11 a/b/g/n"
                                  }, 
                   :description "MOTOROLA XOOM has a super-powerful dual-core processor and Android\u2122 3.0 (Honeycomb) \u2014 the Android platform designed specifically for tablets. With its 10.1-inch HD widescreen display, you\u2019ll enjoy HD video in a thin, light, powerful and upgradeable tablet.", 
                   :display {
                             :screenResolution "WXGA (1200 x 800)", 
                             :screenSize "10.1 inches", 
                             :touchScreen true
                             }, 
                   :hardware {
                              :accelerometer true, 
                              :audioJack "3.5mm", 
                              :cpu "1 GHz Dual Core Tegra 2", 
                              :fmRadio false, 
                              :physicalKeyboard false, 
                              :usb "USB 2.0"
                              }, 
                   :id "motorola-xoom", 
                   :images [
                            "img/phones/motorola-xoom.0.jpg", 
                            "img/phones/motorola-xoom.1.jpg", 
                            "img/phones/motorola-xoom.2.jpg"
                            ], 
                   :name "MOTOROLA XOOM\u2122", 
                   :sizeAndWeight {
                                   :dimensions [
                                                "249.0 mm (w)", 
                                                "168.0 mm (h)", 
                                                "12.7 mm (d)"
                                                ], 
                                   :weight "726.0 grams"
                                   }, 
                   :storage {
                             :flash "32000MB", 
                             :ram "1000MB"
                             }
                   }
   
   :motorola-atrix-4g {
                       :additionalFeatures "", 
                       :android {
                                 :os "Android 2.2", 
                                 :ui "MOTOBLUR"
                                 }, 
                       :availability [
                                      "AT&amp;T"
                                      ], 
                       :battery {
                                 :standbyTime "400 hours", 
                                 :talkTime "5 hours", 
                                 :type "Lithium Ion (Li-Ion) (1930 mAH)"
                                 }, 
                       :camera {
                                :features [
                                           ""
                                           ], 
                                :primary ""
                                }, 
                       :connectivity {
                                      :bluetooth "Bluetooth 2.1", 
                                      :cell "WCDMA 850/1900/2100, GSM 850/900/1800/1900, HSDPA 14Mbps (Category 10) Edge Class 12, GPRS Class 12, eCompass, AGPS", 
                                      :gps true, 
                                      :infrared false, 
                                      :wifi "802.11 a/b/g/n"
                                      }, 
                       :description "MOTOROLA ATRIX 4G gives you dual-core processing power and the revolutionary webtop application. With webtop and a compatible Motorola docking station, sold separately, you can surf the Internet with a full Firefox browser, create and edit docs, or access multimedia on a large screen almost anywhere.", 
                       :display {
        :screenResolution "QHD (960 x 540)", 
        :screenSize "4.0 inches", 
        :touchScreen true
        }, 
                       :hardware {
                                  :accelerometer true, 
                                  :audioJack "3.5mm", 
                                  :cpu "1 GHz Dual Core", 
                                  :fmRadio false, 
                                  :physicalKeyboard false, 
                                  :usb "USB 2.0"
                                  }, 
                       :id "motorola-atrix-4g", 
                       :images [
                                "img/phones/motorola-atrix-4g.0.jpg", 
                                "img/phones/motorola-atrix-4g.1.jpg", 
                                "img/phones/motorola-atrix-4g.2.jpg", 
                                "img/phones/motorola-atrix-4g.3.jpg"
                                ], 
                       :name "MOTOROLA ATRIX\u2122 4G", 
                       :sizeAndWeight {
                                       :dimensions [
                                                    "63.5 mm (w)", 
                                                    "117.75 mm (h)", 
                                                    "10.95 mm (d)"
                                                    ], 
                                       :weight "135.0 grams"
                                       }, 
                       :storage {
                                 :flash "", 
                                 :ram ""
                                 }
                       }
   })
