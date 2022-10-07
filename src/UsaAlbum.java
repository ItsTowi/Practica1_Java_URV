
public class UsaAlbum {
	public static void main(String[] args) {
		
		Album primer = new Album("Primer album", 100, 100, 10, 10);
		Album segon = new Album("Segon album", 200, 200, 10, 10);
		Album tercer = new Album("Tercer album", 100, 100, 7, 5);
		
		
		primer.afegirFoto();
		System.out.println(primer.getNumTotalFotosPosades());
		primer.treureFoto();
		System.out.println(primer.getNumTotalFotosPosades());
		
		if (primer.teMesLliure(segon)) {
			System.out.println("El primer album té més espai lliure");
		} else {
			System.out.println("El segon album te més espai lliure");
		}
		
		Album mesPetit = primer.elMesPetit(tercer);
		
		if (mesPetit != null) {
			System.out.println(mesPetit.toString());
		}
		
		testClass(primer);
		
		
	}
	
	public static void testClass(Album album) {
		
		//int i = 0;
		//int paginesAfegides = 5;
		//Album test = new Album(nom, alt, amp, numPag, numPic);
		
		// Imprimim l'estat inical del album
		
		System.out.println(album.toString() + "\n");
		
		// Test getNom
		
		/*
		if (album.getNom() == this.nom) {
			System.out.println("La rutina getNom funciona correctament, nom: " + test.getNom());
		} else {
			System.out.println("La rutina getNom no funciona correctament, nom: " + test.getNom());
		}
		
		// Test getCmAlt
		
		if (test.getCmAlt() == alt) {
			System.out.println("La rutina getCmAlt funciona correctament, altura: " + test.getCmAlt());
		} else {
			System.out.println("La rutina getCmAlt no funciona correctament, altura: " + test.getCmAlt());
		}
		
		// Test getCmAmple
		
		if (test.getCmAmple() == amp) {
			System.out.println("La rutina getCmAmple funciona correctament, amplada: " + test.getCmAmple());
		} else {
			System.out.println("La rutina getCmAmple no funciona correctament, amplada: " + test.getCmAmple());
		}
		
		// Test getNumTotalPagines
		
		if (test.getNumTotalPagines() == numPag) {
			System.out.println("La rutina getNumTotalPagines funciona correctament, pagines: " + test.getNumTotalPagines());
		} else {
			System.out.println("La rutina getNumTotalPagines no funciona correctament, pagines: " + test.getNumTotalPagines());
		}
		
		// Test getNumFotosPagina
		
		if (test.getNumFotosPagina() == numPic) {
			System.out.println("La rutina getNumFotosPagina funciona correctament, fotos: " + test.getNumFotosPagina());
		} else {
			System.out.println("La rutina getNumFotosPagina no funciona correctament, fotos: " + test.getNumFotosPagina());
		}
		
		// Test getNumPaginesPlenes
		
		if (test.getNumPaginesPlenes() == 0) {
			System.out.println("La rutina getNumPaginesPlenes funciona correctament, plenes: " + test.getNumPaginesPlenes());
		} else {
			System.out.println("La rutina getNumPaginesPlenes no funciona correctament, plenes: " + test.getNumPaginesPlenes());
		}
		
		
		// Test isAlbumPle
		
		if (!test.isAlbumPle()) {
			System.out.println("La rutina isAlbumPle funciona correctament, el album no esta ple");
		} else {
			System.out.println("La rutina isAlbumPle no funciona correctament, el album ha de estar buit");
		}
		
		
		// Test getNumTotalFotosPosades
		
		if (test.getNumTotalFotosPosades() == 0) {
			System.out.println("La rutina getNumTotalFotosPosades funciona correctament, posades: " + test.getNumTotalFotosPosades());
		} else {
			System.out.println("La rutina getNumTotalFotosPosades no funciona correctament, posades: " + test.getNumTotalFotosPosades());
		}
		
		// Test afegirFoto
		
		test.afegirFoto();
		
		if (test.getNumTotalFotosPosades() == 1) {
			System.out.println("La rutina getNumTotalFotosPosades funciona correctament, posades: " + test.getNumTotalFotosPosades());
		} else {
			System.out.println("La rutina getNumTotalFotosPosades no funciona correctament, posades: " + test.getNumTotalFotosPosades());
		}
		
		
		// Test afegirPagines
		
		test.afegirPagines(paginesAfegides);
		
		System.out.println("Afegim " + paginesAfegides + " pagines");
		
		if (test.getNumTotalPagines() == numPag + paginesAfegides) {
			System.out.println("La rutina afegirPagines funciona correctament, pagines: " + test.getNumTotalPagines());
		} else {
			System.out.println("La rutina afegirPagines no funciona correctament, pagines: " + test.getNumTotalPagines());
		}
		
		// Test treurePagines
		
		test.treurePagines(paginesAfegides);
		
		System.out.println("Treiem " + paginesAfegides + " pagines");
		
		if (test.getNumTotalPagines() == numPag) {
			System.out.println("La rutina treurePagines funciona correctament, pagines: " + test.getNumTotalPagines());
		} else {
			System.out.println("La rutina treurePagines no funciona correctament, pagines: " + test.getNumTotalPagines());
		}
		
		*/
		
		// Test copia
		
		album.copia();
		
		Album copia = album.copia();
		
		System.out.println(album.toString());
		System.out.println(copia.toString());
		
		
		/*
		// Emplenem l'album i mirem si s'ha emplenat correctament
		
		while (i <= test.getNumFotosPagina() * test.getNumTotalPagines()) {
			test.afegirFoto();
			i++;
		}
		
		if (test.isAlbumPle()) {
			System.out.println("La rutina isAlbumPle funciona correctament, el album esta ple");
		} else {
			System.out.println("La rutina isAlbumPle no funciona correctament, el album no esta ple");
		}
		
		System.out.println("Fotos posades: " + test.getNumTotalFotosPosades());
		
		System.out.println("\n" + test.toString());
		*/
	}
}
//