public class Fila {
    public String[] senhas = new String[50];
    private int inicio = 0;
    private int fim = 0;
    private int tamanho = 0;
    private int vagasDis = 0;
    
    public void enfileira(String senha) throws Exception{
        
        if(tamanho == senha.length()-1)
            throw new Exception("A fila está cheia");
        
        this.tamanho++;
        this.vagasDis++;
        senhas[fim++] = senha;
        
    }
    public String desfileira() throws Exception{
        if(tamanho == 0){
            throw new Exception("A fila está vazia");
        }
        this.tamanho--;
        return senhas[inicio++];
    }

    public int getSenhaDis(){
        return senhas.length - this.vagasDis;
    }
}
