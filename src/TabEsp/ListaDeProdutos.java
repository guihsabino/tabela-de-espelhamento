package TabEsp;


public class ListaDeProdutos {
    private NoProduto inicio;
    
    public ListaDeProdutos (){
        inicio = null;
    }
    
    public void adiciona(Produto e){
         NoProduto novo = new NoProduto(e);
         if (inicio == null)
             inicio = novo;
         else{
             if (novo.dado.getCodigo() <
                     inicio.dado.getCodigo()){
                novo.prox = inicio;
                inicio = novo;
             } else {
            	 NoProduto aux = inicio;
                 while (aux.prox != null && 
             novo.dado.getCodigo() > aux.dado.getCodigo()){
                     aux = aux.prox;
                 }
                 novo.prox = aux.prox;
                 aux.prox = novo;
             }
         }
             
    }
    
    public Produto remove (int codigo){
        Produto p = null;
        
        if (inicio == null)
             System.out.println("ERRO! Lista Vazia");
         else{
            if (codigo == inicio.dado.getCodigo()){
                p = inicio.dado;
                inicio = inicio.prox;
             } else {
            	 NoProduto aux1 = inicio, aux2=null;
                 while (aux1.prox != null && 
                    codigo != aux1.dado.getCodigo()){
                     aux2 = aux1;
                     aux1 = aux1.prox;
                 }
                 if (codigo == aux1.dado.getCodigo()){
                     p = aux1.dado;
                     aux2.prox = aux1.prox;
                 }
                 else {
                     System.out.println("ERRO! Código Não Encontrado");
                 }
             }
         }
        return p;
    }
    
    public String percorre(){
    	NoProduto aux = inicio;
        String r = "";
        while (aux != null){
            r = r + "\n" + aux.dado.toString();
            aux=aux.prox;
        }
        return r;
    }
}
