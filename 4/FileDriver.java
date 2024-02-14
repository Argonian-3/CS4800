public class FileDriver {
	public static void main(String[] args) {
		Folder app = new Folder("app");
		app.addFolder(new Folder("config"));
		app.addFolder(new Folder("controllers"));
		app.addFolder(new Folder("library"));
		app.addFolder(new Folder("migrations"));
		app.addFolder(new Folder("models"));
		app.addFolder(new Folder("views"));
		Folder sourceFiles=new Folder("Source Files");
		sourceFiles.addFolder(new Folder(".phalcon"));
		sourceFiles.addFolder(app);
		sourceFiles.addFolder(new Folder("cache"));
		sourceFiles.addFolder(new Folder("public"));
		sourceFiles.addFile(new File(".htaccess"));
		sourceFiles.addFile(new File(".htrouter.php"));
		sourceFiles.addFile(new File("index.html"));
		Folder php_demo1 = new Folder("php_demo1");
		php_demo1.addFolder(sourceFiles);
		php_demo1.addFolder(new Folder("Include Path"));
		php_demo1.addFolder(new Folder("Remote Files"));
		php_demo1.print();
		System.out.println();
		sourceFiles.deleteFolder("app");
		php_demo1.print();
		System.out.println();
		sourceFiles.deleteFolder("public");
		php_demo1.print();
	}
}