public class Ibge {
    public static void main(String[] args) {
        for(Estados e : Estados.values()){

            //para sair todos eles:
           // System.out.println(e.getSigla()+"-"+e.getNome());


        }
        Estados eb = Estados.CEARA;
        System.out.println(eb.getSigla());
        System.out.println(eb.getNome());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
    

}
