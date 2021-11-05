programa
{
	
	funcao inicio()
	{
		inteiro vetor[5],maior=0,x,num
		
		

		para(x = 0; x < 4; x++)
		{
			
		escreva("\nDigite o ",x+1," valor: ")
		leia(num)
		
		vetor[x] = num
		
		se(num>maior)
		{
		
			maior=num
		}				
	}
	escreva("\nO maior valor digitado foi: ", maior)
}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 166; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */