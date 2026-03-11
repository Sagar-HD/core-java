class Server {

    String[] names;
    Server[] servers;

    Server(String[] names, Server[] servers){
        this.names = names;
        this.servers = servers;
    }

    void info(){

        System.out.println("Server Info");

        for(String n : names){
            System.out.println(n);
        }

        if(servers != null){
            System.out.println("Server Objects: " + servers.length);
        }
    }
}