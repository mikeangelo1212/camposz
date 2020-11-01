package hiloRunnable;

public class hiloJava implements Runnable
{
private String nombre;
	
	public hiloJava(String nombre)
	{
		this.nombre=nombre;
	}

	
	public void run()
	{
		
		for(int i=1;i<=8;i++)
		{
			if(nombre.equalsIgnoreCase("Hilo 1"))
			{
				System.out.println(i+" "+ nombre +"---->" );
			}
			else if(nombre.equalsIgnoreCase("Hilo 2"))
			{
				System.out.println(i+" "+ nombre +"<----" );
			}
			
			else
			{
				System.out.println(i+" "+ nombre +"-----" );
			}
			
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
		
		}
		
	}
}

class Apliacion
{
	public static void main(String[]Args)
	{
		hiloJava nuevo = new hiloJava("Hilo 1");
		Thread hilo = new Thread(nuevo);

		hiloJava nuevo2 = new hiloJava("Hilo 2");
		Thread hilo2 = new Thread(nuevo2);

		hiloJava nuevo3 = new hiloJava("Hilo 3");
		Thread hilo3 = new Thread(nuevo3);

		hilo.start();
		hilo2.start();
		hilo3.start();

	}
	

}