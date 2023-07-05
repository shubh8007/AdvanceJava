package cm.app.dto;

import java.time.LocalDateTime;

import lombok.Getter;
@Getter

public class ApiResponse {
	private String message;
	private LocalDateTime timestamp;
	
	public ApiResponse(String message) {
		this.message=message;
		this.timestamp=LocalDateTime.now();
		
		
	}

}
