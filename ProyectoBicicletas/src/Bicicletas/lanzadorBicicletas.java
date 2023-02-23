package Bicicletas;


public class lanzadorBicicletas {
public static void main(String[] args) {
bicimtb mibici = new bicimtb("TREK","X CALIBER 9",suspensiones.DELANTERA,(byte)1,true,135.5f,(short)0,false);
System.out.println(mibici.toString());
mibici.acelerar();
mibici.estropear();
mibici.acelerar();
mibici.reparar();
mibici.acelerar();
mibici.acelerar();
}
}
