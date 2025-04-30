import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ShellCommandHandler {
    private File currentDirectory;

    public ShellCommandHandler() {
        currentDirectory = new File(System.getProperty("user.dir"));
    }

    public void printWorkingDirectory() {
        System.out.println(currentDirectory.getAbsolutePath());
    }

    public void listDirectory() {
       File [] files = currentDirectory.listFiles();
       if(files!=null){
       for(int i = 0; i<files.length; i++){
        if(files[i].isDirectory()){
        System.out.println("[DIR]"+files[i].getName());
        }
        else if(files[i].isFile()){
        System.out.println("[FILE]"+files[i].getName());
    }
       }
       }
       else {
           System.out.println("This folder is empty or cannot be read");
       }
    }

    public void changeDirectory(String name) {
        if(name==null){
            System.out.println("Usage: cd [directory_name]");
        } else if (name.equals("..")) {
        File parent = currentDirectory.getParentFile();
        if(parent!=null&&parent.exists()){
            currentDirectory=parent;
            System.out.println("Moved to: "+currentDirectory.getAbsolutePath());
        }
        else {
            System.out.println("No parent directory");
        }
        }
        else {
            File file = new File(currentDirectory,name);
            if(file.exists()&&file.isDirectory()){
                currentDirectory=file;
                System.out.println("Moved to: "+currentDirectory.getAbsolutePath());
            }
            else {
                System.out.println("Directory not found: "+name);
            }
        }
    }

    public void makeDirectory(String name) {
        if(name==null){
            System.out.println("Usage: mkdir [directory_name]");
        }
        else {
            File file = new File(currentDirectory,name);
            if(file.exists()){
                System.out.println("Directory already exists.");
            }
            else {
                boolean created = file.mkdir();
                if(created){
                    System.out.println("Directory created: "+name);
                }
                else {
                    System.out.println("Failed to create directory.");
                }
            }
        }
    }

    public void createFile(String name) {
        if (name == null) {
            System.out.println("Usage: touch [file_name]");
        } else {
            try {
                File file = new File(currentDirectory, name);
                if (file.exists()) {
                    System.out.println("File already exists.");
                } else {
                    boolean created = file.createNewFile();
                    if (created) {
                        System.out.println("File created: " + name);
                    } else {
                        System.out.println("Failed to create file: " + name);
                    }
                }
            } catch (IOException e) {
                System.out.println("Failed to create file: " + name);
                System.out.println("Error details:   " +e.getMessage());
            }
        }
    }

    public void printHelp() {
        // TODO: Implement help command to print information about all available commands
        // List all commands with their descriptions
        System.out.println("Available commands:");
        System.out.println("pwd            - Print the current working directory");
        System.out.println("ls             - List all files and directories in the current directory");
        System.out.println("cd [dir]       - Change directory to [dir] or '..' to go up");
        System.out.println("mkdir [name]   - Create a new directory with the given name");
        System.out.println("touch [name]   - Create a new empty file with the given name");
        System.out.println("help           - Show this help information");
        System.out.println("exit           - Exit the shell");
    }

    public File getCurrentDirectory() {
        return currentDirectory;
    }
}
