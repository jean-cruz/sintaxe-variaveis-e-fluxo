public class TestaLacos2 {
    public static void main(String[] args) {
        

        for(int linha = 0;linha < 10;linha++){
            for(int coluna = 0;coluna < 10;coluna++){
                if(coluna > linha){
                    break;
                }
                System.out.print("*");
            }
            System.out.println();    
        }
        //desafio
        for(int contador = 1;contador <= 100;contador++){
            if(contador % 3 == 0) {
                System.out.println(contador);
            }
            
        }

    }
}
