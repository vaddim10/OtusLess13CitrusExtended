package pojo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class UserResponse {

    @JsonProperty("data")
    private Data data;

    @JsonProperty("support")
    private Support support;

    public void setData(Data data) {
        this.data = data;
//        System.out.println("set data = "+data);
    }

    public void setSupport(Support support) {
        this.support = support;
//        System.out.println("set Support = "+ support);
    }

    public Data getData() {
//        System.out.println("getData data=" + data );
        return data;
    }

    public Support getSupport() {
        return support;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "data=" + data +
                ", support=" + support +
                '}';
    }
}
