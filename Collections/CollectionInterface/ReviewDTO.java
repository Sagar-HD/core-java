package CollectionInterface;

public class ReviewDTO {
    private int reviewId;
    private int productId;
    private int customerId;
    private int rating;
    private String comment;

    public ReviewDTO() {
    }

    public ReviewDTO(int reviewId, int productId, int customerId, int rating, String comment) {
        this.reviewId = reviewId;
        this.productId = productId;
        this.customerId = customerId;
        this.rating = rating;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "ReviewDTO{" +
                "reviewId=" + reviewId +
                ", productId=" + productId +
                ", customerId=" + customerId +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                '}';
    }
}

