package code.sandeep.jetcircularper.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ViewCompositionStrategy
import code.sandeep.circledroidper.JetCircularPer
import code.sandeep.jetcircularper.databinding.LayoutSimpleBinding

class CircularXMLActivity : ComponentActivity() {
    private lateinit var binding: LayoutSimpleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutSimpleBinding.inflate(layoutInflater)
        binding.composeView.apply {
            //Dispose of the composition when the view's LifeCycleOwner id destroyed
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                JetCircularPer(percentage = 0.8f, number = 200, color = Color.Blue)
            }
        }
        setContentView(binding.root)
    }
}