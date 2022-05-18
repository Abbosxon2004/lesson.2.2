package uz.pdp.online.lesson_2_2.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_2.Entity.Display;
import uz.pdp.online.lesson_2_2.Entity.GamingChair;
import uz.pdp.online.lesson_2_2.Entity.Product;

@Projection(types = GamingChair.class)
public interface GamingChairCustom {
    Integer getId();

    String getBrand();

    String getColor();

    Integer getWeightLimit();

    boolean getHeadrest();

    Product getProduct();
}
