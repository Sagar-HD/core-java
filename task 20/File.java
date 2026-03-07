class Folder {
    String name;
    int files;

    Folder(String name, int files) {
        this.name = name;
        this.files = files;
    }

    void displayInfo() {
        System.out.println("Folder Name: " + name);
        System.out.println("Number of Files: " + files);
    }
}

class Permission {
    String level;
    boolean editable;

    Permission(String level, boolean editable) {
        this.level = level;
        this.editable = editable;
    }

    void displayInfo() {
        System.out.println("Permission Level: " + level);
        System.out.println("Editable: " + editable);
    }
}

class Owner {
    String name;
    int id;

    Owner(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Owner Name: " + name);
        System.out.println("Owner ID: " + id);
    }
}

class Version {
    int number;
    String date;

    Version(int number, String date) {
        this.number = number;
        this.date = date;
    }

    void displayInfo() {
        System.out.println("Version Number: " + number);
        System.out.println("Version Date: " + date);
    }
}

class Storage {
    String type;
    double size;

    Storage(String type, double size) {
        this.type = type;
        this.size = size;
    }

    void displayInfo() {
        System.out.println("Storage Type: " + type);
        System.out.println("Storage Size: " + size);
    }
}

class File {

    int id;
    double size;
    boolean encrypted;
    char type;
    String name;

    Folder folder;
    Permission permission;
    Owner owner;
    Version version;
    Storage storage;

    File(int id, double size, boolean encrypted, char type, String name,
         Folder folder, Permission permission, Owner owner,
         Version version, Storage storage) {

        this.id = id;
        this.size = size;
        this.encrypted = encrypted;
        this.type = type;
        this.name = name;

        this.folder = folder;
        this.permission = permission;
        this.owner = owner;
        this.version = version;
        this.storage = storage;
    }

    void displayInfo() {
        System.out.println("File ID: " + id);
        System.out.println("File Name: " + name);
        System.out.println("File Size: " + size);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("File Type: " + type);

        folder.displayInfo();
        permission.displayInfo();
        owner.displayInfo();
        version.displayInfo();
        storage.displayInfo();
    }
}

public class FileRunner {

    public static void main(String[] args) {

        Folder folder = new Folder("Documents", 20);
        Permission permission = new Permission("Admin", true);
        Owner owner = new Owner("Rahul", 101);
        Version version = new Version(3, "2026-03-07");
        Storage storage = new Storage("SSD", 512.5);

        File file = new File(1, 15.7, true, 'D', "Report",
                folder, permission, owner, version, storage);

        file.displayInfo();
    }
}