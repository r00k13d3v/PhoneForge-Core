package com.phoneforge.core.config;

import com.phoneforge.core.domain.Province;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ProvinceSeedConfiguration {

    @Bean
    public List<Province> provinceSeed() {
        List<Province> provinces = new ArrayList<>();

        provinces.add(new Province("01", "Araba/Álava", "País Vasco", List.of("945", "845")));
        provinces.add(new Province("02", "Albacete", "Castilla-La Mancha", List.of("967", "867")));
        provinces.add(new Province("03", "Alicante", "Comunitat Valenciana", List.of("965", "966", "865", "866")));
        provinces.add(new Province("04", "Almería", "Andalucía", List.of("950", "850")));
        provinces.add(new Province("05", "Ávila", "Castilla y León", List.of("920", "820")));
        provinces.add(new Province("06", "Badajoz", "Extremadura", List.of("924", "824")));
        provinces.add(new Province("07", "Illes Balears", "Illes Balears", List.of("971", "871")));
        provinces.add(new Province("08", "Barcelona", "Catalunya", List.of("931", "932", "833", "832")));
        provinces.add(new Province("09", "Burgos", "Castilla y León", List.of("947", "847")));
        provinces.add(new Province("10", "Cáceres", "Extremadura", List.of("927", "827")));
        provinces.add(new Province("11", "Cádiz", "Andalucía", List.of("956", "856")));
        provinces.add(new Province("12", "Castellón", "Comunitat Valenciana", List.of("964", "864")));
        provinces.add(new Province("13", "Ciudad Real", "Castilla-La Mancha", List.of("926", "826")));
        provinces.add(new Province("14", "Córdoba", "Andalucía", List.of("957", "857")));
        provinces.add(new Province("15", "A Coruña", "Galicia", List.of("981", "881")));
        provinces.add(new Province("16", "Cuenca", "Castilla-La Mancha", List.of("969", "869")));
        provinces.add(new Province("17", "Girona", "Catalunya", List.of("972", "872")));
        provinces.add(new Province("18", "Granada", "Andalucía", List.of("958", "858")));
        provinces.add(new Province("19", "Guadalajara", "Castilla-La Mancha", List.of("949", "849")));
        provinces.add(new Province("20", "Gipuzkoa", "País Vasco", List.of("943", "843")));
        provinces.add(new Province("21", "Huelva", "Andalucía", List.of("959", "859")));
        provinces.add(new Province("22", "Huesca", "Aragón", List.of("974", "874")));
        provinces.add(new Province("23", "Jaén", "Andalucía", List.of("953", "853")));
        provinces.add(new Province("24", "León", "Castilla y León", List.of("987", "887")));
        provinces.add(new Province("25", "Lleida", "Catalunya", List.of("973", "873")));
        provinces.add(new Province("26", "La Rioja", "La Rioja", List.of("941", "841")));
        provinces.add(new Province("27", "Lugo", "Galicia", List.of("982", "882")));
        provinces.add(new Province("28", "Madrid", "Comunidad de Madrid", List.of("910", "911", "810", "811")));
        provinces.add(new Province("29", "Málaga", "Andalucía", List.of("951", "952", "851", "852")));
        provinces.add(new Province("30", "Murcia", "Región de Murcia", List.of("968", "868")));
        provinces.add(new Province("31", "Navarra", "Comunidad Foral de Navarra", List.of("948", "848")));
        provinces.add(new Province("32", "Ourense", "Galicia", List.of("988", "888")));
        provinces.add(new Province("33", "Asturias", "Principado de Asturias", List.of("985", "984", "885", "884")));
        provinces.add(new Province("34", "Palencia", "Castilla y León", List.of("979", "879")));
        provinces.add(new Province("35", "Las Palmas", "Canarias", List.of("928", "828")));
        provinces.add(new Province("36", "Pontevedra", "Galicia", List.of("986", "886")));
        provinces.add(new Province("37", "Salamanca", "Castilla y León", List.of("923", "823")));
        provinces.add(new Province("38", "Santa Cruz de Tenerife", "Canarias", List.of("922", "822")));
        provinces.add(new Province("39", "Cantabria", "Cantabria", List.of("942", "842")));
        provinces.add(new Province("40", "Segovia", "Castilla y León", List.of("921", "821")));
        provinces.add(new Province("41", "Sevilla", "Andalucía", List.of("954", "955", "854", "855")));
        provinces.add(new Province("42", "Soria", "Castilla y León", List.of("975", "875")));
        provinces.add(new Province("43", "Tarragona", "Catalunya", List.of("977", "877")));
        provinces.add(new Province("44", "Teruel", "Aragón", List.of("978", "878")));
        provinces.add(new Province("45", "Toledo", "Castilla-La Mancha", List.of("925", "825")));
        provinces.add(new Province("46", "València", "Comunitat Valenciana", List.of("961", "962", "861", "862")));
        provinces.add(new Province("47", "Valladolid", "Castilla y León", List.of("983", "883")));
        provinces.add(new Province("48", "Bizkaia", "País Vasco", List.of("944", "946", "844", "846")));
        provinces.add(new Province("49", "Zamora", "Castilla y León", List.of("980", "880")));
        provinces.add(new Province("50", "Zaragoza", "Aragón", List.of("976", "876")));
        provinces.add(new Province("51", "Ceuta", "Ciudad Autónoma de Ceuta", List.of("956", "856")));
        provinces.add(new Province("52", "Melilla", "Ciudad Autónoma de Melilla", List.of("952", "852")));

        return List.copyOf(provinces);
    }
}
