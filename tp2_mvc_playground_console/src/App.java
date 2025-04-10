import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import model.ContatoDTO;
import model.dao.ContatoDAO;
import model.factory.ConnectionFactory;
import model.factory.TipoBanco;
import model.repositories.ContatoEmMemoriaRepositoryImpl;
import model.repositories.ContatoMySqlRepositoryImpl;
import model.repositories.iContatoRepository;
import model.services.ContatoService;
import view.ConsoleView;

public class App {
    /*static iContatoRepository repository;

    private static void config(String param){
        if (param.equals("-mysql")){
            TipoBanco tipo = TipoBanco.getTipo(param);
            ContatoDAO dao = new ContatoDAO(ConnectionFactory.getConnection(tipo));
            repository = new ContatoMySqlRepositoryImpl(dao);
        }else{
            repository = new ContatoEmMemoriaRepositoryImpl();
        }
    }*/

    public static void main(String[] args) throws Exception {
        /*try{
            config(args[0]);
        }catch (Exception e){
            config("local");
        }*/
        /*Connection connectionMysql = ConnectionFactory.getConnection("mysql");
        Connection connectionMariaDb = ConnectionFactory.getConnection("mariadb");
        System.out.println(connectionMysql);
        System.out.println(connectionMariaDb);

        ResultSet rstMySQL = connectionMysql.createStatement().executeQuery("select version() as versao;");
        ResultSet rstMariaDb = connectionMariaDb.createStatement().executeQuery("select version() as versao;");

        if (rstMariaDb.next()){
            System.out.println(rstMariaDb.getString("versao"));
        }
        if (rstMySQL.next()){
            System.out.println(rstMySQL.getString("versao"));
        }*/

       /* String databaseType = args[0];

        TipoBanco tipo = TipoBanco.getTipo(databaseType);

        ContatoDAO dao = new ContatoDAO(ConnectionFactory.getConnection(tipo));*/


        //TODO: Criar menu para seleção de funções:
        /*
         *   1. Criar
         *   2. Listar
         *   3. Buscar
         *   4. Atualizar
         *   5. Excluir
         *   6. Sair
         */

        // TODO: Mover menu para classe View

        /*
         * A classe View deverá conter a dependencia da classe ContatoController
         *
         * Deverá também conter o menu de opções
         *
         * Cada opção do menu deverá realizar uma função do controller
         *
         * NÃO precisa implementar a lógica de negócio do controller
         *
         */




/*        var c1 = new ContatoDTO(
                null,
                "Casemiro",
                "case.miro@gmail.com",
                "199999999"
        );

        var service = new ContatoService(repository);
        service.salvar(c1);*/

    // Conexão mongoDB

    String url = "mongodb://localhost:27017";
    MongoClient mongoClient = MongoClients.create(url);

    MongoDatabase db = mongoClient.getDatabase("contatos");
    MongoCollection<Document> contatosCollection = db.getCollection("contatos");
    System.out.println(db);
    System.out.println(contatosCollection);

    var c1 = new Document("nome", "Casemiro")
            .append("email", "case.miro@gmail.com")
            .append("telefone", "199999999");

    contatosCollection.insertOne(c1);
    System.out.println(args[0]);

        ConsoleView console = new ConsoleView(args[0]);
        console.iniciar();

    }
}