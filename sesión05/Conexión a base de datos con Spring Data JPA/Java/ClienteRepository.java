package persistence;

import model.cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.URI;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
public interface ClienteRepository  extends JpaRepository<cliente, Long> {

    int clienteRepository = Integer.parseInt(null);

    @Autowired
    ClienteRepository(int clienteRepository) {
        this.clienteRepository = clienteRepository = 0;
    }

    @PostMapping
    public default ResponseEntity<Void> creaCliente(@RequestBody cliente cliente){
        return ResponseEntity.created(URI.create("")).build();
    }
    @PostMapping
    public default ResponseEntity<Void> creaCliente(@RequestBody cliente cliente){

        model.cliente clienteDB = clienteRepository.save(Cliente);

        return ResponseEntity.created(URI.create(clienteDB.getId().toString())).build();
    }
}
