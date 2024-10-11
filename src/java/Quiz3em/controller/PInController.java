package Quiz3em.controller;

import Quiz3em.model.Pin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Quiz3em.service.PinSpringService;

import java.util.List;

@RestController
@RequestMapping("/api/pin")
public class PInController {
    @Autowired
    private PinSpringService pinService;


    @GetMapping
    public List<Pin> getAllPin() {
        return pinService.getAllPins();
    }

    @PutMapping("/{id}")
    public void editPinById (@PathVariable Long Id, @RequestBody Pin NewPin) {
        pinService.editPinById(Id,NewPin);
    }

    @PostMapping
    public Pin createPin(@RequestBody Pin pin) {
        return pinService.savePin(pin);
    }

    @PostMapping("/All")
    public List<Pin> createPins(@RequestBody List<Pin> PinList) { return pinService.savePins(PinList); }

    @GetMapping("/generate")
    public Pin generatePin() { return pinService.generatePin(); }

    @DeleteMapping("/{id}")
    public void deletePin(@PathVariable Long id) {
        pinService.deletePin(id);
    }

    @PostMapping("/check")
    public boolean check(@RequestBody Pin NewPin){
        return pinService.check(NewPin);
    }

    @PostMapping("/extendesTimePin")
    public void check(){
        pinService.extendesTimePin();
    }
}
