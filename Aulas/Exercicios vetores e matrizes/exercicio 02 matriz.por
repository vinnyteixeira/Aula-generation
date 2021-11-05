programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3],val,x,soma=0,somaDiagonal
		

		escreva("\nDigite os valores: ")
		
		
		para(val=0;val<3;val++)
		{
			para(x=0;x<3;x++)
			{
		
				leia(matriz[val][x])		
				soma=soma+matriz[val][x]
				
			}
		}
		escreva("\nA soma dos valores: ",soma)

		somaDiagonal=matriz[0][0]+matriz[1][1]+matriz[2][2]
		
		escreva("\nA soma da diagonal principal= ",somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 89; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 6, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */