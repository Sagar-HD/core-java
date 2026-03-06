public class Folder {
    String name;
    int files;

    public Folder(String name, int files) {
        this.name = name;
        this.files = files;
    }
}
public class Permission {
    String level;
    boolean editable;

    public Permission(String level, boolean editable) {
        this.level = level;
        this.editable = editable;
    }
}
public class Owner {
    String name;
    int id;

    public Owner(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
public class Version {
    int number;
    String date;

    public Version(int number, String date) {
        this.number = number;
        this.date = date;
    }
}
public class Storage {
    String type;
    double size;

    public Storage(String type, double size) {
        this.type = type;
        this.size = size;
    }
}
public class File {

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

    public File(int id, double size, boolean encrypted, char type, String name,
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
}