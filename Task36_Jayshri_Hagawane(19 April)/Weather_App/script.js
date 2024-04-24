document.getElementById("searchBtn").addEventListener("click", function() {
    var cityName = document.getElementById("search").value;
    fetch("https://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&appid=b1b15e88fa797225412429c1c50c122a1">api.openweathermap.org/data/2.5/forecast?id&appid={API key}")
    .then(response => response.json())
    .then(data => {
        var weatherInfo = document.getElementById("weather-info");
        weatherInfo.innerHTML = `
            <h2>${data.name}, ${data.sys.country}</h2>
            <p>Weather: ${data.weather[0].main}</p>
            <p>Description: ${data.weather[0].description}</p>
            <p>Temperature: ${(data.main.temp - 273.15).toFixed(1)}°C</p>
            <p>Humidity: ${data.main.humidity}%</p>
        `;
    })
    .catch(error => {
        console.log("Error fetching weather data: ", error);
        alert("Error fetching weather data. Please try again.");
    });
});
