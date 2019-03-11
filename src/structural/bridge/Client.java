package structural.bridge;

/*
Bridge design pattern is used to decouple a class into two parts – abstraction and it’s
implementation – so that both can evolve in future without affecting each other.
It increases the loose coupling between class abstraction and it’s implementation.
 */
public class Client {

    public static void main(String[] args){

        String os = "linux";
        FileDownloaderAbstraction downloaderAbstraction;

        switch (os){
            case "windows":
                downloaderAbstraction = new FileDownloaderAbstractionImpl(new WindowsFileDownloadImplementor());
                break;
            case "linux":
                downloaderAbstraction = new FileDownloaderAbstractionImpl(new LinuxFileDownloadImplementor());
                break;
            default:
                downloaderAbstraction = null;
                System.out.println("OS not supported!");
        }

        Object fileContent = downloaderAbstraction.download("some path");
        downloaderAbstraction.store(fileContent);
    }
}
