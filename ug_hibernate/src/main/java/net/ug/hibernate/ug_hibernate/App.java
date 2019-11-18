package net.ug.hibernate.ug_hibernate;


public class App 
{
	
	public  static void  imprimir(String mensaje){
		System.out.println(mensaje.toString());
		
	}
	
	
	
    public static void main( String[] args )
    {
    	
    	
    	crear();
    	read();
    	update();
    	read();
    	delete();
    	
    	
       
    }
    

	public static void crear(){
		AeropuertoDao AeropuertoDao = new AeropuertoDao();
		Aeropuerto producto = new Aeropuerto(1,"Jose Joaquin de Olmedo","Guayaquil","Ecuador","7:00","9;00");		
				
		AeropuertoDao.setup();
		AeropuertoDao.crear(producto);
		Aeropuerto producto1 = new Aeropuerto(2,"Mariscal Sucre","Quito","Ecuador","18:00","20:00");	
		AeropuertoDao.setup();
		AeropuertoDao.crear(producto1);
		
		Aeropuerto producto2 = new Aeropuerto(3,"Santa Rosa","Medellin","Colombia","17:00","19:00");
		AeropuertoDao.crear(producto2);
		
		Aeropuerto producto3 = new Aeropuerto(4,"La Joya Andina","La paz","Bolivia","10:00","12:00");	
		AeropuertoDao.crear(producto3);
		
		
	}
	
	
	public static void read(){
		AeropuertoDao AeropuertoDao = new AeropuertoDao();
		Aeropuerto producto = new Aeropuerto();	
		AeropuertoDao.setup();
		producto =AeropuertoDao.read(1);
		imprimir(producto.toString());
		
		//daoProducto.setup();
		//imprimir(producto.toString());
		//book.imprimir();
	}

	public static void update() {

		AeropuertoDao AeropuertoDao = new AeropuertoDao();
		AeropuertoDao.setup();
		Aeropuerto producto =AeropuertoDao.read(1);
		producto.setCiudad("cambios ");
		AeropuertoDao .update(producto);
		
		
	}
	

	public static void delete(){
		AeropuertoDao daoProducto = new AeropuertoDao();
		daoProducto.setup();
		daoProducto.delete(2);
		
	}
    
    
    
    
}
