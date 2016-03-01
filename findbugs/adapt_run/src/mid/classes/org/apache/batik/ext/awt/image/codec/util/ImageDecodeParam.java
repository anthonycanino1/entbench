package org.apache.batik.ext.awt.image.codec.util;
public interface ImageDecodeParam extends java.lang.Cloneable, java.io.Serializable {
    java.lang.String jlc$CompilerVersion$jl7 = "2.7.0";
    long jlc$SourceLastModified$jl7 = 1445630120000L;
    java.lang.String jlc$ClassType$jl7 = ("H4sIAAAAAAAAAMVXW2wUVRg+u9vbLr1DC+FSoNTEguxIFAy2hktp7cK23bRI" +
                                          "4lZdzs6c7Q6dnTnMnGm3xYiaqMQHQwIoMaFPJSZGkRgTfZHUmBiMt6BEASNq" +
                                          "fDKGhL54CfHynzOzu7NDS3hzkzlz9pz//89//c4/b91AlZaJ2inWFRxlU5RY" +
                                          "0QSfJ7BpEaVHw5a1H1ZT8ss/nzj6xzfh54KoKonqs9gakLFF+lSiKVYSrVF1" +
                                          "i2FdJtYgIQrnSJjEIuYEZqqhJ1GLasVyVFNllQ0YCuEEB7AZR02YMVNN24zE" +
                                          "XAEMrY0LbSShjbTLT9AVR7WyQadKDCvLGHo8e5w2VzrPYqgxfghPYMlmqibF" +
                                          "VYt15U20iRra1JhmsCjJs+ghbavriL3xrbe5of18w++3jmcbhRuWYl03mDDR" +
                                          "GiaWoU0QJY4aSqu9GslZh9EzKBRHSzzEDHXEC4dKcKgEhxbsLVGB9nVEt3M9" +
                                          "hjCHFSRVUZkrxND6ciEUmzjnikkInUFCDXNtF8xg7bqitYVw+0w8tUk6+dpT" +
                                          "je+GUEMSNaj6CFdHBiUYHJIEh5JcmpjWLkUhShI16RDwEWKqWFOn3Wg3W+qY" +
                                          "jpkNKVBwC1+0KTHFmSVfQSTBNtOWmWEWzcuIpHL/VWY0PAa2tpZsdSzs4+tg" +
                                          "YEQFxcwMhtxzWSrGVV0ReVTOUbSxYx8QAGt1jrCsUTyqQsewgJqdFNGwPiaN" +
                                          "QPLpY0BaaUAKmiLXFhHKfU2xPI7HSIqhFX66hLMFVGHhCM7CUIufTEiCKK30" +
                                          "RckTnxuD3a8c0fv1IAqAzgqRNa7/EmBq8zENkwwxCdSBw1i7Mf4qbv3wWBAh" +
                                          "IG7xETs07z89v/O+trmLDs2qBWiG0oeIzFLybLr+0uqezu0hrkYNNSyVB7/M" +
                                          "clFlCXenK08BaVqLEvlmtLA5N/zJ48++SX4LokgMVcmGZucgj5pkI0dVjZiP" +
                                          "Ep2YmBElhsJEV3rEfgxVwzyu6sRZHcpkLMJiqEITS1WG+A8uyoAI7qIIzFU9" +
                                          "YxTmFLOsmOcpQqgaHhSAZz1yfuv4wNARKWvkiIRlrKu6ISVMg9vPAyowh1gw" +
                                          "V2CXGlIa8n9885boQ5Jl2CYkpGSYYxKGrMgSZ1PUKZ5kkpqDZJBkwCbZcVOM" +
                                          "L+whfCXB6zjKk5D+v8fnuXeWTgYCELjVftjQoOL6DU0hZko+ae/unT+X+sxJ" +
                                          "SV5Grl8Zehh0iDo6RIUOAmRBh6jQISp0cJLBrwMKBMTRy7guDglEexxwA4C7" +
                                          "tnPkyb0Hj7WHIFHpZAWPVV4U8qrCH2D06Swg45EReubKl78+EETBEro0eK6F" +
                                          "EcK6PBnNZTaL3G0q6bHfJATofjidOHHqxkujQgmg2LDQgR187IFMBpsA5l64" +
                                          "ePjqj9dnLweLiocYQLqdhtuRoRqcBjzEMmMoXAQ2x7Bl/8IvAM8//OE28gUn" +
                                          "SZt73EpZVywVSj3uCIr5CoaWChs4tgGkGDrBaY0U9hw/q0a0COewyf24ZjEw" +
                                          "EkA6+/zJGWXo7BYHMprLC7wX7q+3v/378+jpnz5dIDvCzKCbNTJBtLLYwT3t" +
                                          "Twbu3hW3XV0O3MrnZhpqls889l0QVXggsRaimLE1rXii93R+jZoko4ocrxVj" +
                                          "ExWvbQx13nXSMlTBX0L7rQ7/drjd74afoUrx9vJ2M9R2Z17gEm8v1w5A3cW4" +
                                          "GArB6KXeDZFeiBooYfRS9kIc/JRwvnh76foZipToIJudiZdkH0gHEj6NU5oP" +
                                          "+Eu1Y5EezNMOpeTjl2/WHbh5YV4kUnk/5S3gAUy7nIDyoYWLX+6HkH5sZYHu" +
                                          "wbnBJxq1uVsgMQkSZQBNa8gETMuXlbtLXVl97aOPWw9eCqFgH4poBlb6MO9c" +
                                          "4P5hWWh2sgCHebpjp3N/TNbA0CgMRH5zN5SZKxo31+AB22ndUvI7M3sHj8xv" +
                                          "O+sAFbR809Piooe+JWOYOawVW7r1i0oryKrq77xVfz58D69Rj2cEvvt1W1uy" +
                                          "Gy5aDRKVu7ijN0fZFEfe6Q+Wv9f9xsx1AWBwZVJemitLTLtME09ZHeLF6a/O" +
                                          "dl/44ljV1+DjURTAgEGjng7LaSegObDh5NG490PE86Wgcijqivxy8Ks/rwWa" +
                                          "3ZMRvxza7sSRkk9c+D6RofT1IArHoHJ0heST0DJae6b0YSJPQOhqbF09bJMY" +
                                          "dKNVacPWi+1gPccRzPs/4UTX93XFVbiKoYbbb2v0YJko0Pt6PkIgVyaJuZtL" +
                                          "52LqyoEoYlPq3c3zNmkBqyCMW878dfTFK0OAc2WKe6VVW3aaU7sHlbpNRzYf" +
                                          "G/lwb965OkKp+ACl7lVSez/fSlJK+dtxRdqh5hQMBTZS+h/j6NPdNQ4AAA==");
    java.lang.String jlc$CompilerVersion$jl5 =
      "2.7.0";
    long jlc$SourceLastModified$jl5 = 1445630120000L;
    java.lang.String jlc$ClassType$jl5 = ("H4sIAAAAAAAAAMVYa6zk1l333n1vk+xmSx5K0zSPrUSY5trz9AzbQGY8nvHM" +
                                          "2POwZ+yxgW79fo7fHnsmBKFK0IhKJRKb0g8ln1KBqvQhhAQSAgUhUBEVUqWK" +
                                          "l0RTISRAVaTmAwgRQTn27L139iabtp8YycdnfP7/c37/5/mf88bb0PkohEq+" +
                                          "52x0x4sP1Sw+tJz6Ybzx1ehwSNanYhipCuaIUTQH327JT3/j6n+++4px7QC6" +
                                          "IEAfFl3Xi8XY9NyIViPPWasKCV09+Yo76iqKoWukJa5FOIlNBybNKL5JQh/a" +
                                          "Y42hG+QRBBhAgAEEuIAAt0+oANP9qpussJxDdOMogH4FOkNCF3w5hxdDT909" +
                                          "iS+G4urONNNCAjDDpfw/C4QqmLMQevJY9p3M7xH41RJ8+7c/de33z0JXBeiq" +
                                          "6TI5HBmAiMEiAnTfSl1Jahi1FUVVBOhBV1UVRg1N0TG3BW4Buh6ZuivGSage" +
                                          "Kyn/mPhqWKx5orn75Fy2MJFjLzwWTzNVRzn6d15zRB3I+vCJrDsJe/l3IOAV" +
                                          "EwALNVFWj1jO2aarxNDHTnMcy3hjBAgA68WVGhve8VLnXBF8gK7vbOeIrg4z" +
                                          "cWi6OiA97yVglRh67J6T5rr2RdkWdfVWDD16mm66GwJUlwtF5Cwx9NBpsmIm" +
                                          "YKXHTllpzz5vjz/5+Rddwj0oMCuq7OT4LwGmJ04x0aqmhqorqzvG+36G/IL4" +
                                          "8J+8fABBgPihU8Q7mj/85Xde+MQTb35zR/OR96GZSJYqx7fk16UHvv049mzr" +
                                          "bA7jku9FZm78uyQv3H96Z+Rm5oPIe/h4xnzw8GjwTfov+V/9ivr9A+jKALog" +
                                          "e06yAn70oOytfNNRw77qqqEYq8oAuqy6ClaMD6CLoE+arrr7OtG0SI0H0Dmn" +
                                          "+HTBK/4DFWlgilxFF0HfdDXvqO+LsVH0Mx+CoIvggc6A5ylo93syb2LoRdjw" +
                                          "ViosyqJruh48Db1c/tygriLCsRqBvgJGfQ+WgP/bz5UPUTjykhA4JOyFOiwC" +
                                          "rzDU3WARp2Iaw+YKOAMse8B8OzUN8g9dNf8yzeP4MHdC//93+SzXzrX0zBlg" +
                                          "uMdPpw0HRBzhOYoa3pJvJx38na/d+uuD4zC6o9cY+lmA4XCH4bDAUKRcgOGw" +
                                          "wHBYYNg5w2kM0JkzxdI/lWPZkQBr2yBvgIx637PMLw0//fLTZ4Gj+um53FZZ" +
                                          "EciPFn/OAr5n753le3mKGRRpVQZe/+h/TxzpM//8XwX+/USdT3jwPpF1il+A" +
                                          "3/jSY9jPfb/gvwxyWiwCHwTp4onT8X1XSOaBflqvIFWfzFv5yuo/Dp6+8BcH" +
                                          "0EUBuibf2QdY0UlURgW5+IoZHW0OYK+4a/zuPLYL2pt38kUMPX4a196yN4+S" +
                                          "bi78+X17gn5OnfevFL7xQEHz4A/B7wx4/jd/ckvkH3bRcx27E8JPHsew72dn" +
                                          "zsTQ+coheojk/E/lNj6t4BzA84z/O3//N/9ePYAOTjaCq3tbK1DCzb3kk092" +
                                          "tUgzD564zDxUc2X90xenv/Xq25/9hcJfAMUz77fgjbzNEQP3AzvSr30z+Ie3" +
                                          "vvv6dw6OfexsDHbfRHJMGXSiYmMEkmimKzqFQp6OoUcsR75xJDULNkoA7Ibl" +
                                          "oIWqHgKlQQEtt8rhbncpggwgunEPd92rCG7Jr3znB/ezP/jTd97jqXcrhhL9" +
                                          "mzsLFagyMP0jp6OIECMD0NXeHP/iNefNd8GMAphRBnkjmoQgrLO71HiH+vzF" +
                                          "f/yzP3/4098+Cx30oCuOJyo9Md+8QQqODbDfGyAjZP7Pv7BLoekl0FwrYhMq" +
                                          "5P/IDk4R1g+cKIL0wCb7uX955Vu/+cxbAMcQOr/OfRgg2NPWOMnrjl9/49WP" +
                                          "fuj29z5X2AQk7OkX8Gsv5LM2iwU+XrQ/nTelncXy7ify5rm8OTwy02O5mZgi" +
                                          "T5JiFFOeYoK6Qyks9YGpYxqaK+Bt6zubKvzS9bfsL/3bV3cb5uk8cYpYffn2" +
                                          "b/zw8PO3D/bKlGfeUyns8+xKlQL0/cemfOqDVik4ev/69Zf++Pde+uwO1fW7" +
                                          "N10c1JRf/dv/+dbhF7/3V++Tsc853pFT5m3lzrL5q/6jDRtfvkHUokH76Eex" +
                                          "S66SLlhaLyWttUSG5S5W6jHeeI7rSTbotTcVw459VB5VqhI9qDmCso0aMjpr" +
                                          "KO7cpdz+qprxphhQM2KWDjxK7E2HjNC3aX2uCcRi1TGpuNHB28w40LqjvkHW" +
                                          "a5hGbNztZJug4y5TNbb21tm2/C0MN1swLNdgqVVuO4I4rJgu16MzZ1GneWTG" +
                                          "aEO04+MiS6R1sUyUhXkzimB3azWyrWbUayNvBDJM1NJFm+z1Sg5jjlieCdle" +
                                          "2az0lGHM64NZ6DJDCx8kPC4EgTEs94FrsRu2N3acGcJjCY530LZAIxWeYsfj" +
                                          "Sm2LL9s4FfIIKTGMYUlzct5qszTKbWaiMupia7JPeE21nlbYbTjlAz3TdGPK" +
                                          "U84qMKUey8fl+qKCmHQolofGKsKsYVTSDUlchyZZzUJJrXtauZmWSlVrJUsG" +
                                          "nXC8g1RX3S7dN0XOWyCzIV8TmSBp9SNHMFr4dtShCWa7xbvEEsdqykge6biR" +
                                          "SRHJ9jstl8XjKtUyLIzoMTS7EOwwG3cbsokvVlvLNW174C56WHc5jnvNTEel" +
                                          "wIx5Ni0haTNe2I2S4s8ttdRf4BQzFq0G1lOIjrngieEAN+pDeeVbHGkvDMYY" +
                                          "lBt0N8W5UcD1Jm6V06tcKeAt3x6P2E6KlUvIaE70VgyrzZh5ZxxPuBWHc1s5" +
                                          "GfgECbMcj0zbYiX2hUhhtlGtFOs8PutlckoZcbblmLDPsgitsvPJQmIyPmvO" +
                                          "2v24bIVYtJhvglmkpvowUHrjfjo1xfFsSvo80hHFRXu0MsllzyBG2qKSTQco" +
                                          "wQwCo7dsNAyS6rF9wsAoFFsMEm2Om9hoVEVo2Z67WdKtik0Z0dblQTtob/WA" +
                                          "HosojK86QXOLj+00zTCF6aRlE6W0WiCtqynXaRuDPprh8whBt83WGp6U4nBF" +
                                          "dqNK0OHMPuKpg22P3ICAKiFJoG4TxAhtfjxmNmwHhSnZ6TnYUnVHSLMjsgGJ" +
                                          "r51VTLbrY3g7rDVLJWZZIz1bp1h51RcSWbfqvj1AFNYSzCnuV/hVB3eMaIiz" +
                                          "1RDX9IxNt5ukEdECIfs2SQ3NAB/MmTLXL7WbycZrD9BgAPAsWnw2X/XISbSa" +
                                          "yP4s0EXCYNrCtrzRknUtHbfpEbe2zQHthKOkMWBYSm+tp+2NlxplPWUr2LLv" +
                                          "DMSm22o265I3qw+dCsbbfp/h+WzUDymdEcrTxUio27YfdIVhx04xSZDZCUWW" +
                                          "UkPDlp3G1hrZ9W5p3dTcZKlyc53HcNJitdiaeROy0V0ghmB7JVGFE3deWpai" +
                                          "bMiw9X7oNAXVMBCz6zXowWLSXtEdo2HNBoyPyEOyE6bUqEPN6Q2qJ13dwdUs" +
                                          "S9s1DI3dqb2REMJCOWLQI3yhzU1ZtrZoBiFGVLpIg0n1Wh2n1UQaOWizhOPz" +
                                          "Dh56iDpq9HB51Jh23LEwF8lqHwkaEqEN23NPs0xlQhBBZifWTF/pFbI70+ly" +
                                          "Ex30qI4ftetOo6ZOrcBqKS6ZqqTpyfyMDBQjTmiPDuSOtcWpFeUt27NKhnYc" +
                                          "uDlYt6kmDE/wSlNfuIwQo1XcF9hNyjJWNcEGYR3zRA4zolqs9+1+N+yIPLJo" +
                                          "GSkcICKCTdR0o1VqgoWnuN1ulIAP9bmlh3Z4gvJDEkPTJRqUqmu4CiS0fHdb" +
                                          "VwbdNbYdYdJ4PuzEJMmn82o8T6WkanDVJYtMqlToCoYfOFGz2XKQGbvU9YgW" +
                                          "zRWJl8OlabaqdMkSPNureXKYsRaecWtplpWr7pKhnHlniZBoOENhJbQUtCZq" +
                                          "3iLMWuthhWrRFaGM6viquS6n9XZV5mr9dthpjJZqV+ipZsfzeI1mWvZAhod0" +
                                          "unYNtKF5gunPvcEwUUxBsQlEJ3CrMV7UvWkJT8p8HVe3Y2riq3PLqcAcIRl1" +
                                          "nq3ZC9eG60xVby82qDvobjyeI5elBmET9UjgiSSV3M4wC8oJG+nUzGaEWWcs" +
                                          "NnV8TiVLR4rJJeu0UHEy5dKWigU9naj5XseRGtSkJdemdYPjjEqkY4Qq+ZZf" +
                                          "HcPzsdRGMJ2iifp2XGeEUeZVy6V2p1JxlcV6gFLViLCa2XpSito9iW4iranp" +
                                          "eWppyE34iZiyHBqWTcQLN6MwQNGM1bb1ZrfRoq2KjK/XcZkrJ5v+pi526RGb" +
                                          "oKY1RjShh2tqY1bi1i2tlUVZuc11UoEdqqDeIOdkTOFISyBUstcQ4YniwLWa" +
                                          "Y7HlUtda0PO2jvctV0dJkVH1idQ16uN+rYVM8WaD02XTCsx1tmmOIjhMObEq" +
                                          "UPQ624poxNC23ZJL3QbtaXOQL0PCI4aIoTJzpDsU1YaE8MxwOpsYgdRDWtKQ" +
                                          "4pXRmBXlKWeWyvpUluntNIJri/myVV32WMkcebwkSZU1wg9tD5nGjak90NmN" +
                                          "OEyEmKxXyGDj4R7vTIOqXN2OV3Yn2GAU10SbijbvjZBJW65wI7XBslwVbAFo" +
                                          "RDiSP6a3vNaHnVRqNeoTe+SX2piDOiyjbmGNcYajkhJntBIYdWNGdeYCUzJg" +
                                          "4FFTZTyrgaLo+efzcmnwk1WsDxYHi+M7LFCo5gPIT1CpZR+0YAxdEqUoDkE5" +
                                          "H0OXjy/VdqvvnawPjg4yHz4pzTFQMqqi5KhHY7sju+kdHt8MgsG8dP3ove61" +
                                          "irL19c/cfk2ZfLmcl635TF2AJPb85xx1rTp7GKAMnKNOXxfkp7pH33O5ubuQ" +
                                          "k7/22tVLj7y2+LsD6NzepdllcHjUEsfZP+Hu9S/4oaqZBZLLu9OUX7xuxdCz" +
                                          "P/a1Biio81eB/lM7fimGbvw4/OBoWbz3ecHB/okP5gVcxXufy4ihR+/FFUNn" +
                                          "QbtPbQMDvh81oATtPqUL7HCaEqxfvPfpghi6ckIHzs67zj5JPjsgybtJfkVw" +
                                          "l7lP/Pv6jzqJHLPsn/FzUYvr8Tt+QSW7C/Jb8tdfG45ffKfx5d0dg+yI221x" +
                                          "nUpCFzUvXInO8cX5U/ec7WiuC8Sz7z7wjcsfP3LfB3aATyJ0D9vHTo7WmOc4" +
                                          "wNj5Kf4GvvLjTX6/tf2jR/7gk7/72neLc+7/AZMhde63GAAA");
}