 class Selam {
private String world = "ülke";

public String selamSoyle(String kime){
String cumle;
 if(kime != "")
     cumle = "Hi " + kime + " :)";
 else
     cumle = "Hi  " + world + " :)";

 return  cumle;
}
}
