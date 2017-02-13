package edu.eci.cosw.spademo;

import edu2.eci.cosw.stubs.fakeclientslibrary.ClientServicesStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by 2091412 on 2/13/17.
 */
@RestController
@RequestMapping("/clients")
public class ClientsController {

    private ClientServicesStub clients = new ClientServicesStub();

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAllClients () {
        ResponseEntity a;
        try {
            a = new ResponseEntity<>(clients.getAllClients(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(ClientsController.class.getName()).log(Level.SEVERE, null, ex);
            a = new ResponseEntity<>("Error bla bla bla",HttpStatus.NOT_FOUND);
        }
        return a;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getClient (@PathVariable("id") int id) {
        ResponseEntity a;
        try {
            a = new ResponseEntity<>(clients.getClientById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(ClientsController.class.getName()).log(Level.SEVERE, null, ex);
            a = new ResponseEntity<>("Error bla bla bla",HttpStatus.NOT_FOUND);
        }
        return a;
    }

    @RequestMapping(value = "/{id}/picture", method = RequestMethod.GET)
    public ResponseEntity<InputStreamResource> getClientPicture (@PathVariable("id") int id) {
        ResponseEntity a;
        try {
            a = new ResponseEntity<InputStreamResource>(new InputStreamResource(clients.getClientPicture(id)), HttpStatus.ACCEPTED);
            //a.ok().contentType(MediaType.parseMediaType("image/jpg")).body(new InputStreamResource(clients.getClientPicture(id)));
        } catch (Exception ex) {
            Logger.getLogger(ClientsController.class.getName()).log(Level.SEVERE, null, ex);
            a = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return a;
    }


}
