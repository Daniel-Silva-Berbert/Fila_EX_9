import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Fila fila = new Fila();
        String op = "";

        System.out.println("Isso é uma fila");
        while(!op.equals("3")){  
            System.out.print("---------------------------------------\n");  
            System.out.println("Tem " + fila.getSenhaDis() + " vagas disponiveis.");
            System.out.print("---------------------------------------\n");  
            System.out.println("1 - Adicionar um proximo.");
            System.out.println("2 - Chamar o proximo.");
            System.out.println("3 - Sair.");

            System.out.println("Escolhar opção");
            op = in.nextLine();

            if(op.equals("1")){
                System.out.print("Nome do usuario: ");
                try{
                    fila.enfileira(in.nextLine());
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }else{
                if(op.equals("2")){
                    try{
                        System.out.print("---------------------------------------\n");  
                        System.out.println("Proximo -> " + fila.desfileira());
                    }catch(Exception ex){
                        System.out.println(ex.getMessage());
                    }
                }else{
                    if(!op.equals("3")){
                        System.out.print("---------------------------------------\n");  
                        System.out.println("Comando invalido.");
                    }
                }
            }
        }
    }
}
