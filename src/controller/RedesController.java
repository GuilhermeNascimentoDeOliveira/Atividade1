package controller;

import  java.io.BufferedReader ;
import  java.io.IOException ;
import  java.io.InputStream ;
import  java.io.InputStreamReader ;

public  class  RedesController {

	// construtor
	public  RedesController () {
		super ();
	}



	// Retorna o SO
	public  String  os () {
		 sistema de retorno . getProperty( " os.nome " );


	}
		public  void  main ( String [] args ) {
		 String p =  null , f =  null ;

			if (os() . cont�m( " Windows " )) {
				p =  " IPCONFIG "  + p;
			}
			if (os() . cont�m( " Linux " )) {
				f =  " IFCONFIG "  + f;

			}
		}

		public  void  readProcess ( processo de string  ) {
			tente {
				Processo p = Tempo de  execu��o . getRuntime() . exec(processo);
				InputStream leFluxo = p . getInputStream();
				InputStreamReader convertString =  new  InputStreamReader (leFluxo);
				BufferedReader buffer =  new  BufferedReader (converteString);
				String linha = buffer . Leia a linha();
				while (linha !=  null ) {
					Sistema . fora . println(linha);
					linha = buffer . Leia a linha();
				}
				buffer . Fechar();
				convertString . Fechar();
				leFluxo . Fechar();

			} catch ( Exce��o e) {
				Sistema . erro . println( " Chamada inv�lida " );
			}
		}


		public  void  readTraceRoute ( String  proc ) {
			String pingW =  null , pingL =  null ;

			if (os() . cont�m( " Windows " )) {
				pingW =  " PING "  + pingW;
			}
			if (os() . cont�m( " Linux " )) {
				pingL =  " PING "  + pingL;

			}
			tente {
				Processo p = Tempo de  execu��o . getRuntime() . exec(proc);
				InputStream fluxo = p . getInputStream();
				InputStreamReader convString =  new  InputStreamReader (fluxo);
				BufferedReader buffer =  new  BufferedReader (convString);
				String linha = buffer . Leia a linha();
				linha = buffer . Leia a linha();
				linha = buffer . Leia a linha();
				linha = buffer . Leia a linha();
				linha = buffer . Leia a linha();
				while (linha !=  null ) {
					String [] vetLinha = linha . split( " ms " );
					int tamanho = vetLinha . comprimento;
					String ip = vetLinha[tamanho -  1 ];

					if (ip . cont�m( " [ " )) {
						String [] vetIp = ip . split( " \\ [ " );
						String newIp = vetIp[ 1 ] . replace( " ] " , " " );
						Sistema . fora . println(novoIp);
					} sen�o {
						if ( ! ip . cont�m( " tempo limite " )) {
							Sistema . fora . println(ip . trim());
						}
					}

					linha = buffer . Leia a linha();

				}
			} catch ( IOException e) {
				Sistema . erro . println( " Chamada inv�lida " );
			}
		}


}