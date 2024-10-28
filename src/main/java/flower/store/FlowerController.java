package flower.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {

    @GetMapping
    public List<Flower> getFlowers() {
        return List.of(
            new Flower(FlowerType.ROSE, FlowerColor.RED),
            new Flower(FlowerType.CAMMOMILE, FlowerColor.WHITE)
        );
    }
}
