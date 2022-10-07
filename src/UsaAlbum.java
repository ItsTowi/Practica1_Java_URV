
public class UsaAlbum {
	public static void main(String[] args) {
		
		Album primer = new Album("Primer album", 100, 100, 10, 10);
		Album segon = new Album("Segon album", 200, 200, 10, 10);
		Album tercer = new Album("Tercer album", 100, 100, 7, 5);
			
	
		//Provem els albums amb els valors correctes

		if (testClass(primer, "Primer album", 100, 100, 10, 10)) {
			System.out.println("EL PRIMER ALBUM HA PASAT EL TEST");
		} else {
			System.out.println("EL PRIMER ALBUM NO HA PASAT EL TEST");
		}

		if (testClass(segon, "Segon album", 200, 200, 10, 10)) {
			System.out.println("EL SEGON ALBUM HA PASAT EL TEST");
		} else {
			System.out.println("EL SEGON ALBUM NO HA PASAT EL TEST");
		}

		if (testClass(tercer, "Tercer album", 100, 100, 7, 5)) {
			System.out.println("EL TERCER ALBUM HA PASAT EL TEST");
		} else {
			System.out.println("EL TERCER ALBUM NO HA PASAT EL TEST");
		}
	
		//Provem el album tres amb els valors incorrectes

		if (testClass(tercer, "Tercer album", 5, 2, 1, 1)) {
			System.out.println("EL TERCER ALBUM HA PASAT EL TEST");
		} else {
			System.out.println("EL TERCER ALBUM NO HA PASAT EL TEST");
		}
		

		primer.treureFoto();
		if (primer.teMesLliure(segon)) {
			primer.afegirFoto();
		} else {
			segon.afegirFoto();
		}
		Album mesPetit = primer.elMesPetit(tercer);
		if (mesPetit != null){
			System.out.println("El mes petit es " + mesPetit.getNom());
		} else {
			System.out.println ("Els dos albums tenen la mateixa mida.");
		}


	}
	
	public static boolean testClass(Album album, String nom, int alt, int ample, int nPagines, int nFotosPag) {
		

		int paginesAfegides = 5;
		int correctes = 0;
		int i = 0;

		// Imprimim l'estat inical del album
		
		System.out.println(album.toString() + "\n");
		
		// Test getNom
		
		if (album.getNom() == nom) {
			System.out.println("La rutina getNom funciona correctament, nom: " + album.getNom());
			correctes++;
		} else {
			System.out.println("La rutina getNom no funciona correctament, nom: " + album.getNom());
		}
		
		// Test getCmAlt
		
		if (album.getCmAlt() == alt) {
			System.out.println("La rutina getCmAlt funciona correctament, altura: " + album.getCmAlt());
			correctes++;
		} else {
			System.out.println("La rutina getCmAlt no funciona correctament, altura: " + album.getCmAlt());
		}
		
		// Test getCmAmple
		
		if (album.getCmAmple() == ample) {
			System.out.println("La rutina getCmAmple funciona correctament, amplada: " + album.getCmAmple());
			correctes++;
		} else {
			System.out.println("La rutina getCmAmple no funciona correctament, amplada: " + album.getCmAmple());
		}
		
		// Test getNumTotalPagines
		
		if (album.getNumTotalPagines() == nPagines) {
			System.out.println("La rutina getNumTotalPagines funciona correctament, pagines: " + album.getNumTotalPagines());
			correctes++;
		} else {
			System.out.println("La rutina getNumTotalPagines no funciona correctament, pagines: " + album.getNumTotalPagines());
		}
		
		// Test getNumFotosPagina
		
		if (album.getNumFotosPagina() == nFotosPag) {
			System.out.println("La rutina getNumFotosPagina funciona correctament, fotos: " + album.getNumFotosPagina());
			correctes++;
		} else {
			System.out.println("La rutina getNumFotosPagina no funciona correctament, fotos: " + album.getNumFotosPagina());
		}
		
		// Test getNumPaginesPlenes
		
		if (album.getNumPaginesPlenes() == 0) {
			System.out.println("La rutina getNumPaginesPlenes funciona correctament, plenes: " + album.getNumPaginesPlenes());
			correctes++;
		} else {
			System.out.println("La rutina getNumPaginesPlenes no funciona correctament, plenes: " + album.getNumPaginesPlenes());
		}
		
		
		// Test isAlbumPle
		
		if (!album.isAlbumPle()) {
			System.out.println("La rutina isAlbumPle funciona correctament, el album no esta ple");
			correctes++;
		} else {
			System.out.println("La rutina isAlbumPle no funciona correctament, el album ha de estar buit");
		}
		
		
		// Test getNumTotalFotosPosades
		
		if (album.getNumTotalFotosPosades() == 0) {
			System.out.println("La rutina getNumTotalFotosPosades funciona correctament, posades: " + album.getNumTotalFotosPosades());
			correctes++;
		} else {
			System.out.println("La rutina getNumTotalFotosPosades no funciona correctament, posades: " + album.getNumTotalFotosPosades());
		}
		
		// Test afegirFoto
		
		album.afegirFoto();
		
		if (album.getNumTotalFotosPosades() == 1) {
			System.out.println("La rutina getNumTotalFotosPosades funciona correctament, posades: " + album.getNumTotalFotosPosades());
			correctes++;
		} else {
			System.out.println("La rutina getNumTotalFotosPosades no funciona correctament, posades: " + album.getNumTotalFotosPosades());
		}
		
		
		// Test afegirPagines
		
		album.afegirPagines(paginesAfegides);
		
		System.out.println("Afegim " + paginesAfegides + " pagines");
		
		if (album.getNumTotalPagines() == nPagines + paginesAfegides) {
			System.out.println("La rutina afegirPagines funciona correctament, pagines: " + album.getNumTotalPagines());
			correctes++;
		} else {
			System.out.println("La rutina afegirPagines no funciona correctament, pagines: " + album.getNumTotalPagines());
		}
		
		// Test treurePagines
		
		album.treurePagines(paginesAfegides);
		
		System.out.println("Treiem " + paginesAfegides + " pagines");
		
		if (album.getNumTotalPagines() == nPagines) {
			System.out.println("La rutina treurePagines funciona correctament, pagines: " + album.getNumTotalPagines());
			correctes++;
		} else {
			System.out.println("La rutina treurePagines no funciona correctament, pagines: " + album.getNumTotalPagines());
		}
		
		// Test copia
		
		album.copia();
		
		Album copia = album.copia();

		if (album.sonIguals(copia)) {
			System.out.println("La copia del album és igual al album, correcte");
			correctes++;
		}
		
		
		
		// Emplenem l'album i mirem si s'ha emplenat correctament
		
		while (i <= album.getNumFotosPagina() * album.getNumTotalPagines()) {
			album.afegirFoto();
			i++;
		}
		
		if (album.isAlbumPle()) {
			System.out.println("La rutina isAlbumPle funciona correctament, el album esta ple");
			correctes++;
		} else {
			System.out.println("La rutina isAlbumPle no funciona correctament, el album no esta ple");
		}
		
		System.out.println("Fotos posades: " + album.getNumTotalFotosPosades());
		
		System.out.println("\n" + album.toString());

		if (correctes == 13) {
			return true;
		} else {
			return false;
		}

	}
}