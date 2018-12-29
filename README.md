# Custom Progress Dialog

Custom progress dialog library written for Kotlin.

<h4>Types of Progress Bar</h4>

* INFINITY
* BARS
* ECLIPSE
* BALL
* CUBE
* FLICKR
* INTERWIND
* RIPPLE
* PACMAN
* SPINNER
* TRIANGLE
* WEDGES
* HEART



# Screens
With various dialogs you will make the definition of beautiful transition screens.
<table>
  <tr>
    <th>Infinity</th>
    <th>Heart</th>
    <th>Ball</th>
  </tr>
  <tr>
    <td>
      <center><img src="/art/infinity.gif" width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="/art/heart.gif" width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="/art/ball.gif" width="250" height="350" /></center>
    </td>
  </tr>
   <tr>
    <th>Bars</th>
    <th>Cube</th>
    <th>Flickr</th>
  </tr>
  <tr>
    <td>
      <center><img src="/art/bars.gif" width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="/art/cube.gif" width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="/art/flickr.gif" width="250" height="350" /></center>
    </td>
  </tr>
   <tr>
    <th>Eclipse</th>
    <th>Interwind</th>
    <th>Ripple</th>
  </tr>
  <tr>
    <td>
      <center><img src="/art/eclipse.gif" width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="/art/interwind.gif width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="/art/ripple.gif" width="250" height="350" /></center>
    </td>
  </tr>
   <tr>
    <th>Pacman</th>
    <th>Spinner</th>
    <th>Triangle</th>
    <th>Wedges</th>
  </tr>
  <tr>
    <td>
      <center><img src="/art/pacman.gif" width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="/art/spinner.gif" width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="/art/triangle.gif" width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="/art/wedges.gif" width="250" height="350" /></center>
    </td>
  </tr>

</table>
</br>

# Usage

```Gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  .....

  dependencies {
	        implementation 'com.github.fevziomurtekin:lockscreen:0.1.1'
	  }
	}
  ```
  </br> Include in the activity 
  ```Gradle 
 class MainActivity : AppCompatActivity() {

    private lateinit var progressbar : Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        progressbar = findViewById(R.id.progress)
        progressbar.settype(Type.WEDGES)
        progressbar.setdurationTime(100)
        progressbar.show()
    }
}
  ```
  
  # Attributes

  | Attribute | Description |
| --- | --- |
| `durationTime` | Default time, 100 |
| `type` | The dialog type (by default INFINITY) |


## License

    Copyright 2018 Fevzi Ömür Tekin
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
        http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.



