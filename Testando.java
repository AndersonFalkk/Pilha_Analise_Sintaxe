/**
Uma expressão matemática pode usar vários pares de parênteses agrupados. Vejamos um exemplo:

6 - ( (A + ( B + C ) ) / ( ( D � 3 * E ) + ( F * A + 10))

Em uma expressão matemática, deseja-se que os pares de parênteses estejam corretamente agrupados. Por exemplo, as expressões exibidas a seguir são considerados inválidas:

( D - E ) ) OU ( ( D + E ) - A

De forma geral, toda vez que tivermos uma expressão com par�nteses, colchetes, chaves, será necessário verificar duas condições:

a) Se o número de parentes (colchetes ou chaves) de abertura é igual ao número de parênteses (colchetes ou chaves) de fechamento.

b) Se um parêntese de fechamento também é precedido pelo respectivo parêntese de abertura.

Podemos definir duas condições, que, obedecidas, expressam a veracidade do agrupamento de parênteses da expressão matemática:

1. No final da expressão, a diferença de parênteses (colchetes ou chaves) deve ser zero. Isso significa que todo parênteses (colchetes ou chaves) de abertura tem um parênteses (colchetes ou chaves) de fechamento, ou que pelo menos o número de parênteses (colchetes ou chaves) de abertura é igual ao número de parênteses (colchetes ou chaves) de fechamento.

2. A diferença de parênteses (colchetes ou chaves) em qualquer ponto da expressão é sempre positiva. A verificação dessa condição garante que não deve existir um parênteses (colchetes ou chaves) de abertura sem o respectivo parênteses (colchetes ou chaves) de fechamento. 
*/

import java.util.Scanner;

/**
 *
 * @author Anderson Dias - 13102904
 */

public class Testando {

    public static void main(String[] args) {
        System.out.println("Escreva uma express�o matem�tica");
        
        String exprMat = new Scanner(System.in).nextLine();

        Pi s = new Pi(exprMat.length());

        String proxima = "";
        
        for (int i = 0; i < exprMat.length(); i++) {

        	if (exprMat.charAt(i) == '(') {
                	s.push('(');
                	proxima = ")";
	            } else if (exprMat.charAt(i) == '[' && proxima != ")") {
	            	s.push('[');
	            	proxima = "]";
	            } else if (exprMat.charAt(i) == '{' && (proxima != ")" || proxima !="]")) {
	            	s.push('{');
		        }
	            else if (exprMat.charAt(i) == '}' && proxima =="}") {
	                if (s.taVazia()) {
	                    System.out.println("Erro de sintaxe!");
	                    break;
	                } else {
	                    s.pop();
	                    if (exprMat.length() - 1 == i && s.taVazia()) {
	                        System.out.println("Sintaxe aceita!");
	                        break;
	                    } else {
	                    	proxima = (String) s.ElemTopo();
	                    }
	                }
	            }
	            else if (exprMat.charAt(i) == ']' && proxima == "]") {
	                if (s.taVazia()) {
	                    System.out.println("Erro de sintaxe!");
	                    break;
	                } else {
	                    s.pop();
	                    if (exprMat.length() - 1 == i && s.taVazia()) {
	                        System.out.println("Sintaxe aceita!");
	                        break;
	                    } else {
	                    	proxima = (String) s.ElemTopo();
	                    }
	                }
	            }
	            else if (exprMat.charAt(i) == ')' && proxima == ")") {
	                if (s.taVazia()) {
	                    System.out.println("Erro de sintaxe!");
	                    break;
	                } else {
	                    s.pop();
	                    if (exprMat.length() - 1 == i && s.taVazia()) {
	                        System.out.println("Sintaxe aceita!");
	                        break;
	                    } else {
	                    	proxima = (String) s.ElemTopo();
	                    }
	                }
	            }
	            
	            if (!s.taVazia() && exprMat.length() - 1 == i) {
	                System.out.println("Erro de sintaxe!");
	                break;
	            } else if (s.taVazia() && exprMat.length() - 1 == i) {
	                System.out.println("Sintaxe aceita!");
	                break;
	            }
        }
    }
}