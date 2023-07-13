package mx.com.digitalchallengers.yml.Entidades.listData;


import lombok.Data;


@Data
public class DataList {
    private String uuid;
    private String displayName;
    private String titleText;
    private boolean isHiddenIfNotOwned;
    private String assetPath;
}
