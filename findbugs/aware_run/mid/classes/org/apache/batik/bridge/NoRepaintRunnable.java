package org.apache.batik.bridge;
public interface NoRepaintRunnable extends java.lang.Runnable {
    java.lang.String jlc$CompilerVersion$jl7 = "2.7.0";
    long jlc$SourceLastModified$jl7 = 1445630120000L;
    java.lang.String jlc$ClassType$jl7 = ("H4sIAAAAAAAAAL1Wa2wURRyfu+ublj6gLeEllJpYkNsQXtGCArW1h9f20iKJ" +
                                          "V/WY252723Zvd5idba/FiJqoxA+GBFBiQj+VmBhFYkz0i6TGxGB8BSUKGFHj" +
                                          "J2NI6BcfIT7+M7t3t3dt/egluzs385v/+/XmLVRpM9RBsanhMJ+ixA7HxDqG" +
                                          "mU20HgPb9iHYTagv/XTq+O9f1z4bRFVxtDyD7QEV26RPJ4Zmx9E63bQ5NlVi" +
                                          "DxKiiRsxRmzCJjDXLTOOWnU7kqWGrup8wNKIABzGLIqaMedMTzqcRDwCHN0V" +
                                          "ldIoUhplfzmgO4rqVYtOFS+sLrnQ4zsT2GyRn81RU3QMT2DF4bqhRHWbd+cY" +
                                          "2kItYyptWDxMcjw8Zuz0DHEwunOBGTouNv5252SmSZphBTZNi0sV7WFiW8YE" +
                                          "0aKosbjba5CsfRQ9jUJRtMwH5qgzmmeqAFMFmOb1LaJA+gZiOtkeS6rD85Sq" +
                                          "qCoE4mhjKRGKGc56ZGJSZqBQwz3d5WXQdkNB27y7y1Q8s0U5/eqTTe+EUGMc" +
                                          "NermiBBHBSE4MImDQUk2SZi9X9OIFkfNJjh8hDAdG/q05+0WW0+bmDsQAnmz" +
                                          "iE2HEiZ5Fm0FngTdmKNyixXUS8mg8v5VpgycBl3birq6GvaJfVCwTgfBWApD" +
                                          "7HlXKsZ1U5NxVHqjoGPnIwCAq9VZwjNWgVWFiWEDtbghYmAzrYxA8JlpgFZa" +
                                          "EIJMxtoSRIWtKVbHcZokOFpVjou5R4CqlYYQVzhqLYdJSuCl1WVe8vnn1uCe" +
                                          "l4+Z/WYQBUBmjaiGkH8ZXFpfdmmYpAgjkAfuxfrN0Vdw2wcngggBuLUM7GLe" +
                                          "e2p+373r5y67mDWLYIaSY0TlCXU2ufzK2p6u+0JCjBpq2bpwfonmMsti3kl3" +
                                          "jkKlaStQFIfh/OHc8MePPfMG+TWI6iKoSrUMJwtx1KxaWaobhD1MTMIwJ1oE" +
                                          "1RJT65HnEVQN66huEnd3KJWyCY+gCkNuVVnyP5goBSSEiepgrZspK7+mmGfk" +
                                          "OkcRQtXwoAA865D7WyteHI0pGStLFKxiUzctJcYsob9wqKw5xIa1BqfUUpIQ" +
                                          "/+Nbt4V3K7blMAhIxWJpBUNUZIh7qCSZrqWJMmgNE4ohcocd08RJg4RFzNH/" +
                                          "lVtO6L5iMhAAt6wtLwoG5FO/ZWiEJdTTzoHe+QuJT92AE0niWY2jLmAZdlmG" +
                                          "JcuwyzK8gCUKBCSnlYK163xw3TgUAajC9V0jTxw8cqIjBFFHJyuE4XMyK9fk" +
                                          "/8DFMhFl/u8doeeuffHL9iAKFktFo6/GjxDe7QtPQbNFBmJzUY5DjBDAfX82" +
                                          "durMrRdHpRCA2LQYw07x7oGwhFoLNev5y0ev/3Bz9mqwIHiIQ312ktDqOKrB" +
                                          "SShuWOUc1RaqlKvYyn/gF4Dnb/EIHcWGG3EtPV7YbyjEPaU+cwTkehUApQ6i" +
                                          "UIXzZhaWWrdU7ZB1b/a50zPa0Pltboa3lOZjL7Sbt77567Pw2R8/WcTdtdyi" +
                                          "Ww0yQYwS73DUvMDfwoKrFrQatzyqF2Yaa9pnHv02iCp8JaweHJVyDKPA0s9e" +
                                          "tD1GUrqM2nr5bqbys4Oj9iXCEHzhLqS42138bpgCyvEcVcqvH3c/R3VFHJBy" +
                                          "F37IXo5CABHLByjNBcpjtnOJycLX5BPqyau3Gw7fvjQv7V06JfgjeQDTbldt" +
                                          "8WoV5NvLc6kf2xnA7ZgbfLzJmLsDFONAUYXaYA8xyOVcSdx76MrqGx9+1Hbk" +
                                          "SggF+1CdYWGtD4t+DFWVZ6CFZ6AM5OiD+9yqOFkDryapICpXd1OJunIc8RQe" +
                                          "cNyBJKG+PXNw8Nj8rvNuxsIgMz0t2xd045TFstgoDCobl6SWp1XV33Vn+cXa" +
                                          "u0Uo+ywj61q5bHcV9Yb2YUBRFSbu7M1SPiVK0PT77e/ueX3mpsxkyDEqAnh1" +
                                          "8dJ+xvCU3Sk/An99ds+lz09UfQU2HkUBzNGKUd/c4DZJaHkOcB6N+sdr3/yr" +
                                          "i0Tprvv5yJd/3Ai0eJyRqJLr/+tGQj116btYitLXgqg2giohqUkuDoOQ/dCU" +
                                          "OUzUCXBdjWPqRx0SgRmrKmk5ZmHIWS6yDYupRhrRs31DYRc6DlSujgXjC2wT" +
                                          "DSY632gNsTJJ2AFBXZBpKE3XOodS/2lONP9FtAI3bjv35/EXrg1BNSgR3E+t" +
                                          "2naSAu0xKs5QLm3xbhKve3JuDQ0logOUejV12S5xFKWUiu9hqfQhFy0QHAU2" +
                                          "U/ovcMQqUQsNAAA=");
    java.lang.String jlc$CompilerVersion$jl5 =
      "2.7.0";
    long jlc$SourceLastModified$jl5 = 1445630120000L;
    java.lang.String jlc$ClassType$jl5 = ("H4sIAAAAAAAAAL04acjk5nn6vr039l6tDxzbie0NdDvxpxlpNAebtJZGo5nR" +
                                          "3KOR5mjSte6RRrdezUiTupRAG9NAaug6zY90fzm0BOegFFrogUtpSWkoBEIv" +
                                          "aBxKoS3BEP9oKTVt+krzHbPfeh3ypwOjeUfvc1/v87xvvoOcCwMk57lWolsu" +
                                          "OFBjcGBaxAFIPDU8YDvEQAxCValZYhiO4bs78vPfvPqf7722uLaPnJ8jPyU6" +
                                          "jgtEYLhOOFJD11qpSge5evK2bql2CJBrHVNciWgEDAvtGCG43UE+tIMKkJud" +
                                          "IxFQKAIKRUAzEVDyBAoiPao6kV1LMUQHhD7yy8heBznvyal4AHnufiKeGIj2" +
                                          "IZlBpgGkcDH9L0ClMuQ4QD56rPtW5wcUfj2H3v2tX7z2e2eQq3PkquFwqTgy" +
                                          "FAJAJnPkEVu1JTUISUVRlTly3VFVhVMDQ7SMTSb3HLkRGrojgihQj42Uvow8" +
                                          "Nch4nljuETnVLYhk4AbH6mmGailH/85plqhDXR8/0XWrIZO+hwpeNqBggSbK" +
                                          "6hHK2aXhKAD5yGmMYx1vtiEARL1gq2DhHrM664jwBXJj6ztLdHSUA4Hh6BD0" +
                                          "nBtBLgB56qFEU1t7orwUdfUOQJ48DTfYbkGoS5khUhSAPHYaLKMEvfTUKS/t" +
                                          "+Oed3ie+8Bmn6exnMiuqbKXyX4RIz55CGqmaGqiOrG4RH/nZzhfFx//k1X0E" +
                                          "gcCPnQLewvzBL7370seffetbW5gPvw9MXzJVGdyR35CufOfp2q3qmVSMi54b" +
                                          "Gqnz79M8C//B4c7t2IOZ9/gxxXTz4GjzrdFfzn7lq+oP9pHLLeS87FqRDePo" +
                                          "uuzanmGpQUN11EAEqtJCLqmOUsv2W8gFuO4Yjrp929e0UAUt5KyVvTrvZv+h" +
                                          "iTRIIjXRBbg2HM09WnsiWGTr2EMQ5AL8Invw+wyy/TydPgBiogvXVlFRFh3D" +
                                          "cdFB4Kb6pw51FBEFagjXCtz1XFSC8b98sXBQRkM3CmBAom6goyKMioW63USl" +
                                          "wFB0Fe25I9UTYeSOIscRJUs9SGPO+3/lFqe6X1vv7UG3PH26KFgwn5qupajB" +
                                          "HfluRNXf/fqdv94/TpJDqwHkFmR5sGV5kLE82LI8eIAlsreXcfrplPXW+dB1" +
                                          "S1gEYHl85Bb3afblV58/A6POW59NDR9nWflk9ucMxLv18JLNpPWildVIGYbw" +
                                          "k//dt6TP/vN/ZeLuVt2U4P77pMkp/Dn65pefqv3cDzL8S7BAAahHmvvPnk7W" +
                                          "+/IrzdrTZoR194Qu9lX7P/afP/8X+8iFOXJNPizqgmhFKqfCwnrZCI8qPSz8" +
                                          "9+3fX5S2GXj7MPkB8vRpuXbY3j6qoKny53bdB9cpdLq+nIXClQzm+o/gZw9+" +
                                          "/zf9pp5IX2xT4UbtMB8/epyQnhfv7QHkHHZQPsin+M+lPj5t4FSAT3Leb//9" +
                                          "3/w7vo/sn1T1qzvnJDTC7Z1KkhK7mtWM6ychMw7U1Fj/9KXBb77+zud+IYsX" +
                                          "CPHC+zG8mT5TieGxCI+XX/2W/w9vf++N7+4fx9gZAI/SSLIMGS7C7JSDmmiG" +
                                          "I1qZQZ4HyBOmJd880lqApx4U7KZplTNTPQbP+Uy01CsH26Miyyko0c2HhOvO" +
                                          "8X5Hfu27P3xU+OGfvvtApN5vmK7o3d56KJMqhuSfOJ1FTTFcQLjiW71PXbPe" +
                                          "eg9SnEOKMqwKYT+AWRzfZ8ZD6HMX/vHP/vzxl79zBtlnkMuWKyqMmJ7EsJ6C" +
                                          "BTy8F7AAxN7Pv7Sth+uL8HEty00k0//DW3GytL5yYoiOC0/Mz//La9/+jRfe" +
                                          "hnKwyLlVGsNQgh1r9aK0ifi1N19/5kN3v//5zCew+g6+WL/2Ukq1kjH4WPb8" +
                                          "mfSR23osXX48fbyYPg6O3PRU6iYuq4IdMQRdVzFgE6FknvrA0jEIDBtG2+rw" +
                                          "hERfufH28sv/9rXt6Xe6TpwCVl+9++s/OvjC3f2dnuOFB479XZxt35EJ/eix" +
                                          "K5/7IC4ZBvOv33jlj373lc9tpbpx/wlahw3i1/72f7598KXv/9X7FOizlnsU" +
                                          "lOkTO2Sb/hA/3rHg4h83i2GLPPp0ChMRW/OjUaJFOZg5ZknvqHXLYr3ZshcO" +
                                          "p6BRI4NJYVHVsLzRZgV0MsMIrIzh85VCGIokoozB+m5M5hoUQxlDMyfY1IKZ" +
                                          "LTd5ozRuxA2qQnF8u8E0TRbrtUqUrLXG5Vy3DHCAK7DL1a1oE+IVYoXm0Knd" +
                                          "EUZetzqiQtFZdNmcEZPlZkz7DZvH8k19IFWN5mws6it0OvZz/apW2BSlESPE" +
                                          "gE7o8rAuYKXRgC3O7bhaL+HSkOhZgkHHbcMYhfHI3tRYk552xv3+xOHLS3/S" +
                                          "CCKvsu61WyS1aXRavthVle5448sjel1r9vICPEVcfuFZ2sbW+8XAF2agz3C5" +
                                          "sBM4w+ImHGONZORUCiMeH3bHGM0UJX8xak4kJSfPsGULzBIPTOi4K5vryjza" +
                                          "5OlmfR05faoxdqPeioCm5Gxu7i2o8bxn5EOhPGGMSWVWz4ttN5RMSSRqoTYa" +
                                          "Vk2eHYHuukn4+saGwUAyXcbuS4WOyJI5fW70wVLlSgFdITjfr7n1or0w26NG" +
                                          "uyETpXmD5eY+NVxvcIWYTIfKskdh5aScFIaVMM8TqOqPx2quzje6ck8NbIOi" +
                                          "mhRXL3ZbNj3klxg3N6rTar/FLLUeay4qC5pUGqifJ3L5ySSfk2w6HJKOvTHq" +
                                          "WLNuzAnGzjOOPlbsdi8x4inPVWy9siIET09kysIlI/BLjZXIakJtPdY1akJ6" +
                                          "dLlpTdvhvMATvVho+qbbGDitdY30q8J8bfYmupAapk4DSV/MbHITzGKywlqe" +
                                          "zszFeovtxsDlRq0JaAtSU567yz7jCaYbEaNizbdms6GwWfidmcJyUc0qTAS1" +
                                          "snKcQlRTrWJuDkN6SPGUbYpGY9mszKeMpym2PfNI3VySWhRrAYwEZY2tZUfX" +
                                          "dSrq8N1yo6OqmJfDy3hAJKWyTU86s5bIzfJjqzblsUjbtDGvFOXybM2kPB+T" +
                                          "vLXmOnY3BAa+tHBz2bZEDgyZlrZA+0250lUHA63byI0nrZLRdrmA77JrEBfa" +
                                          "sTgRXWlBF7rjbmvNFtx6YcSOS0TTqQvDXqm0iOqOgrfZSVKb5fTashcJgpMM" +
                                          "CN2lOK5uqJ4ezEOvXc7ZdkNb9pfyaAima5ckKyWCLk8SoDZbea/BgQ7Tjg1+" +
                                          "IwNWnoWuVF377TURt8QC5Ws877WGaK4ngaKAt8uS1SUXrXjCehTf4+etRdmv" +
                                          "cfPAn7BdW+/Vi+5CdmUlXxmxenHEbHpN1BJAv9QhjO6CJEFpDTprt0EwfXQ+" +
                                          "MeqsMh5v3KaaG0bsuIqR9bxjwCpjdmxyrlh2g5WjdbJpV/Qa36ZqnGPN2oUS" +
                                          "Hq/xsc6TolmrCnlzHK8rst8yKYZpsklUL067SbuqLdEKzXQXjIVGFcVV1UjT" +
                                          "mp2qQbaZJWDcEtowY1otD8FgKPUYymY3/IygTYomtWkFU6KgG4yUpjeqkVhn" +
                                          "OFvny3HZbawXjNvpqSsiyasrFKc2Vdtft5pGa4gXsCWg/X47gKZfRJM+LxdG" +
                                          "om+1V7PEQXWmSDsSWm815UmjgdfBQCjPpMSsD0Q+J6/HS3XBk96wZPCt6Wa+" +
                                          "ECeTQOHLc6ogoSKR3wzE/MACkiviVn9udsqcBMplolQerLFRBZ3IYwUoiTFZ" +
                                          "5xMoKVfGaX7VpbW12w6YYCiCTeIz2EwUq57TXOUxo+ZVWHGtNlkhodsDMh9W" +
                                          "VUAXGnzgdzEnICRfSsJi36wa01q9uVl0fK6IFfCK5Om1ZFWXBdlfNXEZHeEC" +
                                          "NDiVMHi5NXWJGkk1O1Ri9ijZM4HTZxO5MyWogZ+IEd5Yl7WVOVyVhXyJ1XRT" +
                                          "HdJjyVJAZeIKRG/VkUtLDYsdsjzXJa2zYe1OSDP9HsnPpuKMrMRJX5A5JS6X" +
                                          "uoHfiKu5QlNacrrO5Ao1ZTZpALoIcjQzEealGjMvkV2ib9C5auL3mSUdJKLX" +
                                          "qnlTpdBnI6clV0ZDVe4lFNtu5AbT3rrSMyvBqhfFYUvvbvIAi5V8kRgzIdBd" +
                                          "uuZKVombeIWpgOOCk5OnYpTn3VyyNksFn4AVR6jOJGzGUyOGk6Jyt8ANDKGd" +
                                          "H4zLZRWN1Clue2G8TOi6TzqLQkVhc/GqxuPcEiWdalUJc9YmX+W1IY81lzy1" +
                                          "6TXavILKRXrOis1lX6ZKvVyoBDiaBEZ+7AUrGHusguKkkVfZZOSznQDNgcbQ" +
                                          "LBRKEpgZoDPVfR3TDXfh88uIdvtDVKnxfX7D16aUYk4G/ijOc/rIDtr2kpjb" +
                                          "zdaEKyX0LPJGi2AU4gV6NpJLtMVFpj41a9h6THOzEo7pvXDMshjJUNM55bXr" +
                                          "+LTvKhyKWf3eoMoAsoVL5gon0Po00AtUD3LA6zmAOSJHRvm4HRLDjo3H0qK9" +
                                          "UnE2ood5y9X7vGoKBYwjYqY94Y2ouvC14YJJ8sMmyWM86q7k7tDnh2EPdiuf" +
                                          "TNuY1k/WSV7PGv7jiyLYQKYb+Z+gg4o/iCFALopSCALYZgPk0vHN1Zb7zsS7" +
                                          "dzRg3DhpmY8m6bRpfOZh10NZw/jGZ+/eU/pfKaQNY0qHhryA671oqSvV2uGC" +
                                          "xFDhByb1dKB68oFLwu3Flvz1e1cvPnGP/7t95OzO5dMlOLdpkWXtDpc76/Ne" +
                                          "oGpGJsql7SDjZT+fhgPWQy4Q4ES2XWTifmoL/zIcuE7Dw4kt+92Fg2Pc5RM4" +
                                          "SGq72AXRAHIGgqRLPZ1h77PKiaNv/LhW+RhldwhNx4zsMvbQet1oex17R/7G" +
                                          "Pbb3mXdLX9kOwbIlbjbZ5V0HuaC5gS1ax9e0zz2U2hGt881b71355qWPHXn5" +
                                          "ylbgk1Ddke0jJ7NfzbUsVc7GzJt12wNJegGz+cMnfv8Tv3Pve9kg9n/FiA5R" +
                                          "JRcAAA==");
}
