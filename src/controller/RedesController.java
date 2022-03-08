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

			if (os() . contém( " Windows " )) {
				p =  " IPCONFIG "  + p;
			}
			if (os() . contém( " Linux " )) {
				f =  " IFCONFIG "  + f;

			}
		}

		public  void  readProcess ( processo de string  ) {
			tente {
				Processo p = Tempo de  execução . getRuntime() . exec(processo);
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

			} catch ( Exceção e) {
				Sistema . erro . println( " Chamada inválida " );
			}
		}


		public  void  readTraceRoute ( String  proc ) {
			String pingW =  null , pingL =  null ;

			if (os() . contém( " Windows " )) {
				pingW =  " PING "  + pingW;
			}
			if (os() . contém( " Linux " )) {
				pingL =  " PING "  + pingL;

			}
			tente {
				Processo p = Tempo de  execução . getRuntime() . exec(proc);
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

					if (ip . contém( " [ " )) {
						String [] vetIp = ip . split( " \\ [ " );
						String newIp = vetIp[ 1 ] . replace( " ] " , " " );
						Sistema . fora . println(novoIp);
					} senão {
						if ( ! ip . contém( " tempo limite " )) {
							Sistema . fora . println(ip . trim());
						}
					}

					linha = buffer . Leia a linha();

				}
			} catch ( IOException e) {
				Sistema . erro . println( " Chamada inválida " );
			}
		}


}