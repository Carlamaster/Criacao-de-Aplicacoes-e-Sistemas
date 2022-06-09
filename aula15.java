//CriaÃ§Ã£o de AplicaÃ§Ã£o de Sistemas, aula 15
// Carla RA:

import javax.swing.*;

class aula15
{
		public static void main(String entrada[])		
		{
				// Variaveis
		int n1, n2, p=1;
		char op=0;
		String msg=" ", msgEntr="digite 1 para multiplicar\nDigite 2 para Produtoria\n";
			
				// Ent.Dados
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));			op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
				
				//processamento
                switch(op)
		{
			case '1' -> 		
                        {
        			if (n1>0 && n1>0)
				{
                                    p = n1 * n2;
                		msg = msg + "Multiplicaçao de " + n1 + " por " + n2 + " = " + p + "\n\n";
				}
						
			}
                       	case '2' ->
                        {
               			for(int i=1; i<=n2; i=i+1);
				{
        			p = p * n1;
				}
				msg = msg + "A Produtoria de " + n1 + ", " + n2 + " vezes e: " + p + "\n\n";
			}
							
			default -> JOptionPane.showMessageDialog(null, "Opção invalida, Calculos nao realizados");
		}
				// saida resultados
			if (op >= '1' && op <= '3')
			{
				JOptionPane.showMessageDialog(null , msg);
			}
		
	
	System.exit(0);
		}
}