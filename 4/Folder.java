import java.util.Map;
import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
public class Folder extends File {
	private Map<String,File> files;
	private Map<String,Folder> subfolders;
	public Folder() {
		this.setName("");
		files = new Hashtable<>();
		subfolders = new Hashtable<>();
	}
	public Folder(String newName) {
		this.setName(newName);
		files = new Hashtable<>();
		subfolders = new Hashtable<>();
	}
	public void addFolder(Folder newFolder) {
		subfolders.put(newFolder.getName(),newFolder);
	}
	public Folder getFolder(String name) {
		return subfolders.get(name);
	}
	public void addFile(File newFile) {
		files.put(newFile.getName(),newFile);
	}
	public File getFile(String name) {
		return files.get(name);
	}
	public void deleteFolder(String name) {
		if (subfolders.remove(name)==null)
			throw new RuntimeException(name+" is not in folder "+this.getName());
	}
	public void deleteFile(String name) {
		files.remove(name);
	}
	public String toString() {
		return name;
	}
	public void print() {
		recursiveList(this);
	}
	private Map<String, File> getFiles() {
		return files;
	}
	private Map<String, Folder> getSubfolders() {
		return subfolders;
	}
	private void recursiveList(Folder currentDirectory) {
		Set<String> currentFiles = new HashSet<>();
		currentFiles.addAll(currentDirectory.getFiles().keySet());
		currentFiles.addAll(currentDirectory.getSubfolders().keySet());
		if (currentFiles.size() > 0) {
			System.out.println(currentDirectory.getName()+":\n"+currentFiles+"\n");
			Collection<Folder> currentFolders = currentDirectory.getSubfolders().values();
			for (Folder folder : currentFolders) {
				recursiveList(folder);
			}
		}
	}
}