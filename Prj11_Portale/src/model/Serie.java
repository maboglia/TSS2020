package model;

import java.util.Arrays;
import java.util.List;

public class Serie {

	private String name;
	private List<String> genres;
	private String officialSite;
	private double rating;
	private String image;
	private String summary;
	
	public Serie() {
		// TODO Auto-generated constructor stub
	}

	public Serie(String name, List<String> genres, String officialSite, double rating, String image, String summary) {
		this.name = name;
		this.genres = genres;
		this.officialSite = officialSite;
		this.rating = rating;
		this.image = image;
		this.summary = summary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public String getOfficialSite() {
		return officialSite;
	}

	public void setOfficialSite(String officialSite) {
		this.officialSite = officialSite;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		return "Serie [name=" + name + ", genres=" + genres.toString() + ", officialSite=" + officialSite
				+ ", rating=" + rating + ", image=" + image + ", summary=" + summary + "]";
	}
	
	
	
}
