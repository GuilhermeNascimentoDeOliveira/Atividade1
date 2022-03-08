package view;



import  javax.swing.JOptionPane ;

import  Controller.RedesController ;

 classe  pública Principal {

	 public  static  void  main ( String [] args ) {

		RedesController  Controll  =  new   RedesController ();
		String os =  Controll . os();
		Sistema . fora . println(os);
		int processo =  0 ;

		fazer {
			processo =  inteiro . parseInt( JOptionPane . showInputDialog( null , ( " 1 - Exibir Processos \n 2 - Exibir IPv4 \n 3 - Finalizar " )));


		mudar (processo) {
		caso  1 : 
			String p =  " ipconfig " ;
		    Controle . readProcesso(p);

			quebrar ;
		caso  2 : 
			Sistema . fora . println( " \n " );
			String pingW =  " PING -4 -n 10 www.google.com.br " ;
		    Controle . readTraceRoute(pingW);

	        quebrar ;
		caso  3 : 
			Sistema . fora . println( " \n Execução Finalizada!! " );
			quebrar ;
		}
		} while (processo !=  3 );
	 }
}