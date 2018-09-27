package POO;

public class Principal {
    public static void main(String[] args) {

        Dimensao d1 = new Dimensao(2,4,5);
        Telefone t1 = new Telefone(001,"TEL100","Megatron500",500, d1);
        Semfio sf1 = new Semfio(002, "SEF100", "Xtron500",200,d1,11,300,3 );
//      



        //sf1.ola();
        System.out.println(t1.toString());
        System.out.println(sf1.toString());




    }




}
