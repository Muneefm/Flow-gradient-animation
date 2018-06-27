package mnf.animate.gradient_flow

data class Frame(val orientation: Flow.Orientation = Flow.Orientation.BottomLeft_TopRight,
                 val colors: IntArray, val duration: Int = 6000)