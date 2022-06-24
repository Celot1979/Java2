# Ejercicio práctico de TreeView 
- [Daniel G.M](https://github.com/Celot1979)
## Objetivos del proyecto
El proyecto se realiza para la practica de la contrucción de un componente - TreeView - con Java Fx. Como plus, se ha elegido implementar unos iconos en los Nodos principales.
En la funcionalidad de cada - TreeItem - emergerá una nueva ventana que nos anunciará la pelicula7 género escogido. Además, en la parte inferior de la 1ª ventana podremos ver también el titulo.


<img width="600" alt="Captura de pantalla 2022-06-24 a las 19 05 15" src="https://user-images.githubusercontent.com/67976795/175609312-11a70df2-4361-4ff0-b789-7f0257a93809.png">
<img width="599" alt="Captura de pantalla 2022-06-24 a las 19 05 31" src="https://user-images.githubusercontent.com/67976795/175609327-c384717a-bc60-450e-9b09-4831c2b9a01c.png">

## Explicación de partes del código.
Creamos una raíz que es el nodo principal.
Como podemos comprobar en la interfz no sale
visible la raíz
```java
TreeItem rootItem = new TreeItem("Peliculas");
```java
* Antes de proseguir la creación de los subnodos que colgaran de la raíz principal, crearemos los objetos de imagen.
  Estos serán lo que se implementen en los contructores de los subnodos principales (hijos).
```
      Image icon = new Image(getClass().getResourceAsStream("/img/gu_3.png"));
			ImageView imagen = new ImageView(icon);
			
			Image icon2 = new Image(getClass().getResourceAsStream("/img/fam.png"));
			ImageView imagen2 = new ImageView(icon2);
			
			Image icon3 = new Image(getClass().getResourceAsStream("/img/inf.png"));
			ImageView imagen3= new ImageView(icon3);
			
			Image icon4 = new Image(getClass().getResourceAsStream("/img/com.png"));
			ImageView imagen4= new ImageView(icon4);
			
			Image icon5 = new Image(getClass().getResourceAsStream("/img/dra.png"));
			ImageView imagen5= new ImageView(icon4);
```java

* Creamos los subnodos principales. Colgaran de la raíz principal.
```
	TreeItem Peliculas_Belicas = new TreeItem("Peliculas Bélicas",imagen);
  //Añadimos  a Peliculas Bélicas sus hijos
	Peliculas_Belicas.getChildren().add(new TreeItem("Salvar al soldado Ryan"));
	Peliculas_Belicas.getChildren().add(new TreeItem("La chaqueta metálica"));
	Peliculas_Belicas.getChildren().add(new TreeItem("Apocalipse now"));
  TreeItem Peliculas_Familiares = new TreeItem("Peliculas Familiares",imagen2);
  TreeItem Infantiles = new TreeItem("Peliculas Infantiles",imagen3);
  TreeItem Comedia= new TreeItem("Comedia",imagen4);
  // Opciones de los subdirectorio Infantiles y Comedia
	Infantiles.getChildren().add(new TreeItem("Fantasia"));
	Infantiles.getChildren().add(new TreeItem("Toy Story"));
	Comedia.getChildren().add(new TreeItem("No me chilles que no te veo"));
	Comedia.getChildren().add(new TreeItem("La vida de Bryan"));
			
			
	Peliculas_Familiares.getChildren().add(Infantiles);
	Peliculas_Familiares.getChildren().add(Comedia);
	Peliculas_Familiares.getChildren().add(new TreeItem("Los visitantes"));
	Peliculas_Familiares.getChildren().add(new TreeItem("E.T"));
			
  TreeItem Peliculas_Drama = new TreeItem("Peliculas Drama",imagen5);
  Peliculas_Drama.getChildren().add(new TreeItem("Heat"));
	Peliculas_Drama.getChildren().add(new TreeItem("Bailando con lobos"));
	Peliculas_Drama.getChildren().add(new TreeItem("Gran Torino"));
  //Se añaden a la raíz
  rootItem.getChildren().add(Peliculas_Belicas);
  rootItem.getChildren().addAll(Peliculas_Familiares);
  rootItem.getChildren().add(Peliculas_Drama);

```
