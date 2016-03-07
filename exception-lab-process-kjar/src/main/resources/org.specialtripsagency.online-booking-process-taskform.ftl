<script type='text/javascript'>
	function notEmpty(elem){
		if(elem.value.length == 0){
			return false;
		}
		return true;
	}

	function isNumeric(elem){
		var numericExpression = /^[0-9]+$/;
		if(elem.value.match(numericExpression)){
			return true;
		} else {
			return false;
		}
	}

	function isAlphabet(elem){
        var alphaExp = /^[a-zA-Z0-9\u00A1-\uFFFF\_ .-@]+$/;
        if(elem.value.match(alphaExp)){
            return true;
        } else {
            return false;
        }
    }

    function isAlphanumeric(elem){
        var alphaExp = /^[a-zA-Z0-9\u00A1-\uFFFF\_ .-@]+$/;
        if(elem.value.match(alphaExp) && !isNumeric(elem)){
            return true;
        } else {
            return false;
        }
    }

	function isFloat(elem){
   		if(elem.value.indexOf(".") < 0){
     		return false;
   		} else {
      		if(parseFloat(elem.value)) {
              return true;
          	} else {
              return false;
          	}
   		}
	}

	function taskFormValidator() {
		var i=0;
		var myInputs = new Array();
					myInputs[i] = document.getElementById("applicantName");
					i++;
					myInputs[i] = document.getElementById("emailAddress");
					i++;
					myInputs[i] = document.getElementById("numberOfTravelers");
					i++;
					myInputs[i] = document.getElementById("otherDetails");
					i++;
					myInputs[i] = document.getElementById("flight_carrier");
					i++;
					myInputs[i] = document.getElementById("flight_flightNr");
					i++;
					myInputs[i] = document.getElementById("flight_travelClass");
					i++;
					myInputs[i] = document.getElementById("hotel_id");
					i++;
					myInputs[i] = document.getElementById("hotel_location");
					i++;
					myInputs[i] = document.getElementById("hotel_roomType");
					i++;
					myInputs[i] = document.getElementById("hotel_checkIn");
					i++;
					myInputs[i] = document.getElementById("hotel_checkOut");
					i++;
					myInputs[i] = document.getElementById("bookingStatus");
					i++;
					myInputs[i] = document.getElementById("cc_name");
					i++;
					myInputs[i] = document.getElementById("cc_number");
					i++;
					myInputs[i] = document.getElementById("cc_expiry");
					i++;
					myInputs[i] = document.getElementById("cc_amount");
					i++;


		var j=0;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid applicantName");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid emailAddress");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isNumeric(myInputs[j])) {
							alert("Please enter valid numberOfTravelers");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid otherDetails");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid flight_carrier");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isNumeric(myInputs[j])) {
							alert("Please enter valid flight_flightNr");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid flight_travelClass");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isNumeric(myInputs[j])) {
							alert("Please enter valid hotel_id");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid hotel_location");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid hotel_roomType");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid hotel_checkIn");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid hotel_checkOut");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid bookingStatus");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid cc_name");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid cc_number");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid cc_expiry");
							myInputs[j].focus();
							return false;
						}
					j++;
						if(notEmpty(myInputs[j]) && !isAlphanumeric(myInputs[j])) {
							alert("Please enter valid cc_amount");
							myInputs[j].focus();
							return false;
						}
					j++;

		return true;
	}
</script>
<style type="text/css">
	#container
	{
		margin: 0 auto;
		width: 600px;
		background:#fff;
	}

	#header
	{
		background: #ccc;
		padding: 20px;
		font-family:Arial, Helvetica, sans-serif;
		font-size: 125%;
		letter-spacing: -1px;
		font-weight: bold;
		line-height: 1.1;
		color:#666;
	}

	#header h1 { margin: 0; }

	#content
	{
		clear: left;
		padding: 20px;
	}

	#content h2
	{
		color: #000;
		font-size: 160%;
		margin: 0 0 .5em;
	}

	#footer
	{
		background: #ccc;
		text-align: right;
		padding: 20px;
		height: 1%;
	}

	fieldset {
		border:1px dashed #CCC;
		padding:10px;
		margin-top:20px;
		margin-bottom:20px;
	}
	legend {
		font-family:Arial, Helvetica, sans-serif;
		font-size: 90%;
		letter-spacing: -1px;
		font-weight: bold;
		line-height: 1.1;
		color:#fff;
		background: #666;
		border: 1px solid #333;
		padding: 2px 6px;
	}
	.form {
		margin:0;
		padding:0;
	}
	label {
		width:140px;
		height:32px;
		margin-top:3px;
		margin-right:2px;
		padding-top:11px;
		padding-left:6px;
		background-color:#CCCCCC;
		float:left;
		display: block;
		font-family:Arial, Helvetica, sans-serif;
		font-size: 115%;
		letter-spacing: -1px;
		font-weight: normal;
		line-height: 1.1;
		color:#666;
	}
	.div_texbox {
		width:347px;
		float:right;
		background-color:#E6E6E6;
		height:35px;
		margin-top:3px;
		padding-top:5px;
		padding-bottom:3px;
		padding-left:5px;
	}
	.div_checkbox {
		width:347px;
		float:right;
		background-color:#E6E6E6;
		height:35px;
		margin-top:3px;
		padding-top:5px;
		padding-bottom:3px;
		padding-left:5px;
	}
	.textbox {
		background-color:#FFFFFF;
		background-repeat: no-repeat;
		background-position:left;
		width:285px;
		font:normal 18px Arial;
		color: #999999;
		padding:3px 5px 3px 19px;
	}
	.checkbox {
		background-color:#FFFFFF;
		background-repeat: no-repeat;
		background-position:left;
		width:285px;
		font:normal 18px Arial;
		color: #999999;
		padding:3px 5px 3px 19px;
	}
	.textbox:focus, .textbox:hover {
		background-color:#F0FFE6;
	}
	.button_div {
		width:287px;
		float:right;
		background-color:#fff;
		border:1px solid #ccc;
		text-align:right;
		height:35px;
		margin-top:3px;
		padding:5px 32px 3px;
	}
	.buttons {
		background: #e3e3db;
		font-size:12px; 
		color: #989070; 
		padding: 6px 14px;
		border-width: 2px;
		border-style: solid;
		border-color: #fff #d8d8d0 #d8d8d0 #fff;
		text-decoration: none;
		text-transform:uppercase;
		font-weight:bold;
	}
</style>
<div id="container">
	<div id="header">
		New Process Instance: /exception-lab-process-kjar/src/main/resources.Online Booking Process
	</div>
	<div id="content">
	    <input type="hidden" name="processId" value="${process.id}"/>
		<fieldset>
            <legend>Process inputs</legend>
                            		<label for="name">applicantName</label>
                            		<div class="div_texbox">
                              		<input name="applicantName" type="text" class="textbox" id="applicantName" value="" />
                            		</div>
              	
                            		<label for="name">emailAddress</label>
                            		<div class="div_texbox">
                              		<input name="emailAddress" type="text" class="textbox" id="emailAddress" value="" />
                            		</div>
              	
                            		<label for="name">numberOfTravelers</label>
                            		<div class="div_texbox">
                              		<input name="numberOfTravelers" type="text" class="textbox" id="numberOfTravelers" value="" />
                            		</div>
              	
                            		<label for="name">otherDetails</label>
                            		<div class="div_texbox">
                              		<input name="otherDetails" type="text" class="textbox" id="otherDetails" value="" />
                            		</div>
              	
                            		<label for="name">flight_carrier</label>
                            		<div class="div_texbox">
                              		<input name="flight_carrier" type="text" class="textbox" id="flight_carrier" value="" />
                            		</div>
              	
                            		<label for="name">flight_flightNr</label>
                            		<div class="div_texbox">
                              		<input name="flight_flightNr" type="text" class="textbox" id="flight_flightNr" value="" />
                            		</div>
              	
                            		<label for="name">flight_travelClass</label>
                            		<div class="div_texbox">
                              		<input name="flight_travelClass" type="text" class="textbox" id="flight_travelClass" value="" />
                            		</div>
              	
                            		<label for="name">hotel_id</label>
                            		<div class="div_texbox">
                              		<input name="hotel_id" type="text" class="textbox" id="hotel_id" value="" />
                            		</div>
              	
                            		<label for="name">hotel_location</label>
                            		<div class="div_texbox">
                              		<input name="hotel_location" type="text" class="textbox" id="hotel_location" value="" />
                            		</div>
              	
                            		<label for="name">hotel_roomType</label>
                            		<div class="div_texbox">
                              		<input name="hotel_roomType" type="text" class="textbox" id="hotel_roomType" value="" />
                            		</div>
              	
                            		<label for="name">hotel_checkIn</label>
                            		<div class="div_texbox">
                              		<input name="hotel_checkIn" type="text" class="textbox" id="hotel_checkIn" value="" />
                            		</div>
              	
                            		<label for="name">hotel_checkOut</label>
                            		<div class="div_texbox">
                              		<input name="hotel_checkOut" type="text" class="textbox" id="hotel_checkOut" value="" />
                            		</div>
              	
                            		<label for="name">bookingStatus</label>
                            		<div class="div_texbox">
                              		<input name="bookingStatus" type="text" class="textbox" id="bookingStatus" value="" />
                            		</div>
              	
                            		<label for="name">cc_name</label>
                            		<div class="div_texbox">
                              		<input name="cc_name" type="text" class="textbox" id="cc_name" value="" />
                            		</div>
              	
                            		<label for="name">cc_number</label>
                            		<div class="div_texbox">
                              		<input name="cc_number" type="text" class="textbox" id="cc_number" value="" />
                            		</div>
              	
                            		<label for="name">cc_expiry</label>
                            		<div class="div_texbox">
                              		<input name="cc_expiry" type="text" class="textbox" id="cc_expiry" value="" />
                            		</div>
              	
                            		<label for="name">cc_amount</label>
                            		<div class="div_texbox">
                              		<input name="cc_amount" type="text" class="textbox" id="cc_amount" value="" />
                            		</div>
              	

          </fieldset>
	</div>
	<div id="footer">
	</div>
</div>