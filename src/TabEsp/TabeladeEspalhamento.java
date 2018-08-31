package TabEsp;

public class TabeladeEspalhamento {
    
   private ListaDeProdutos tabela[];
   
   public TabeladeEspalhamento (){
      tabela = new ListaDeProdutos[10];
   }

   public int funcaoDeEspalhamento (int chave){
           return chave % 10;
   }
   
   public void adiciona (Produto p){
      int i = funcaoDeEspalhamento(p.getCodigo());
         if (tabela[i]==null)
            tabela[i]= new ListaDeProdutos();
         tabela[i].adiciona(p);
  
   }
   public Produto remove (int codigo){
      int i = funcaoDeEspalhamento(codigo);
           if (tabela[i]!=null)
                 return tabela[i].remove(codigo);
            //return tabela[i].remove(codigo);   
         
      
      return null;
   }
   
   public void percorre(){
      for (int i=0;i<tabela.length;i++){
        if (tabela[i]!= null)
         System.out.println(tabela[i].percorre());
      }
   }
}
