package pe.idat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pe.idat.colegio.InstitucionEducativa;

@Configuration //indica que esta clase es de configuracion
@ComponentScan //indica el funcionamiento de los beans (clases con @Component)
public class App 
{
    public static void main( String[] args )
    {
        //objeto de Spring Context
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        
        InstitucionEducativa colegioEducativa = (InstitucionEducativa)context.getBean("colegio");
        
        //imprimir
        colegioEducativa.listarPersonas();
    }
}
